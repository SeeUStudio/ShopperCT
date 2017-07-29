package com.seeu.shopper.user.web.shop;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.user.model.UserInfo;
import com.seeu.shopper.user.service.UserInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* Created by neoxiaoyi on 2017/07/26.
*/
@RestController
@RequestMapping("/api/shop/v1/user/info")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;


    @DeleteMapping
    public Result delete(UserInfo userInfo,@RequestAttribute("uid") Integer uid) {
        userInfo.setUid(uid);
        userInfoService.deleteById(uid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(UserInfo userInfo,@RequestAttribute("uid") Integer uid) {
        userInfoService.update(userInfo);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/detail")
    public Result detail(@RequestAttribute("uid") Integer uid) {
        UserInfo userInfo = userInfoService.findById(uid);
        return ResultGenerator.genSuccessResult(userInfo);
    }
}
