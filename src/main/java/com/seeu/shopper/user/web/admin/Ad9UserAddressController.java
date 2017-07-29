package com.seeu.shopper.user.web.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.user.model.UserAddress;
import com.seeu.shopper.user.service.UserAddressService;
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
@RequestMapping("/api/admin/v1/user/address")
public class Ad9UserAddressController {
    @Resource
    private UserAddressService userAddressService;

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        UserAddress userAddress = userAddressService.findById(id);
        return ResultGenerator.genSuccessResult(userAddress);
    }

    @GetMapping("/{page}/{size}")
    public Result list(@PathVariable(value="page") Integer page, @PathVariable(value="size") Integer size) {
        PageHelper.startPage(page, size);
        List<UserAddress> list = userAddressService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
