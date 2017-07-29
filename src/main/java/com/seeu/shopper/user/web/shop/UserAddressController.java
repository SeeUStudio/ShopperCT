package com.seeu.shopper.user.web.shop;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.user.model.UserAddress;
import com.seeu.shopper.user.service.UserAddressService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/07/26.
*/
@RestController
@RequestMapping("/api/shop/v1/user/address")
public class UserAddressController {
    @Resource
    private UserAddressService userAddressService;

    @PostMapping
    public Result add(UserAddress userAddress) {
        userAddressService.save(userAddress);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestAttribute Integer id) {
        userAddressService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(UserAddress userAddress) {
        userAddressService.update(userAddress);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{page}/{size}")
    public Result list(@PathParam(value="page") Integer page,@PathParam(value="size") Integer size) {
        PageHelper.startPage(page, size);
        List<UserAddress> list = userAddressService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
