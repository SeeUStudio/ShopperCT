package com.seeu.oauth;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.core.ServiceException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by neo on 02/07/2017.
 */
@RestController
@RequestMapping("/api/token")
public class JwtController {

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    JwtConstant jwtConstant;

    @RequestMapping("refresh")
    public Result refreshToken(HttpServletRequest request) throws ServiceException {
        // token 一般在 header 的 cookie 里面，所以直接取出来就好
        String signToken = request.getParameter("token");
        if (signToken == null) signToken = request.getHeader("token");// from header

        //验证签名
        SignTokenUser user = null;
        if (StringUtils.isNotEmpty(signToken) && (user = jwtUtil.parseToken(signToken)) != null) {
            // 成功
            try {
                String subject = jwtUtil.generalSubject(user);
                String token = jwtUtil.createJWT(jwtConstant.getJWT_ID(), subject, jwtConstant.getJWT_INTERVAL());
                return ResultGenerator.genSuccessResult(token);
            } catch (Exception e) {
                throw new ServiceException("签名更新失败");
            }
        }
        // 失败
        return ResultGenerator.genNoAuthResult("签名验证失败，无法更新");
    }
    @RequestMapping("/test")
    public Result getDemoInfo(){
        // 生成一个 token , uid = 001, type = seeu, extra = test
        SignTokenUser user = new SignTokenUser();
        user.setUid("1");
        user.setType("seeu");
        user.setExtra("test");
        try {
            String subject = jwtUtil.generalSubject(user);
            String token = jwtUtil.createJWT(jwtConstant.getJWT_ID(), subject, jwtConstant.getJWT_INTERVAL());
            return ResultGenerator.genSuccessResult(token);
        } catch (Exception e) {
            throw new ServiceException("换取签名 TOKEN 失败");
        }

    }
}
