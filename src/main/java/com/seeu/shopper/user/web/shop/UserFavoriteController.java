package com.seeu.shopper.user.web.shop;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.user.model.UserFavorite;
import com.seeu.shopper.user.service.UserFavoriteService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/07/26.
*/
@RestController
@RequestMapping("/api/shop/v1/user/favorite")
public class UserFavoriteController {
    @Resource
    private UserFavoriteService userFavoriteService;

    @PostMapping
    public Result add(UserFavorite userFavorite) {
        userFavoriteService.save(userFavorite);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        userFavoriteService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(UserFavorite userFavorite) {
        userFavoriteService.update(userFavorite);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        UserFavorite userFavorite = userFavoriteService.findById(id);
        return ResultGenerator.genSuccessResult(userFavorite);
    }

    @GetMapping("/{page}/{size}")
    public Result list(@PathParam(value="page") Integer page, @PathParam(value="size") Integer size) {
        PageHelper.startPage(page, size);
        List<UserFavorite> list = userFavoriteService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
