package com.seeu.shopper.user.web.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.user.model.UserFavorite;
import com.seeu.shopper.user.service.UserFavoriteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/07/26.
*/
@RestController
@RequestMapping("/api/admin/v1/user/favorite")
public class Ad9UserFavoriteController {
    @Resource
    private UserFavoriteService userFavoriteService;
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer uid) {
        UserFavorite userFavorite = userFavoriteService.findById(uid);
        return ResultGenerator.genSuccessResult(userFavorite);
    }

    @GetMapping("/{page}/{size}")
    public Result list(@PathVariable(value="page") Integer page, @PathVariable(value="size") Integer size) {
        PageHelper.startPage(page, size);
        List<UserFavorite> list = userFavoriteService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
