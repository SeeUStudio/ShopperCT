package com.seeu.shopper.user.web.shop;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.user.model.UserCoupon;
import com.seeu.shopper.user.service.UserCouponService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/07/29.
*/
@RestController
@RequestMapping("/api/shop/v1/user/coupon")
public class UserCouponController {
    @Resource
    private UserCouponService userCouponService;

    @PostMapping
    public Result add(UserCoupon userCoupon) {
        userCouponService.save(userCoupon);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        userCouponService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(UserCoupon userCoupon) {
        userCouponService.update(userCoupon);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        UserCoupon userCoupon = userCouponService.findById(id);
        return ResultGenerator.genSuccessResult(userCoupon);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<UserCoupon> list = userCouponService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
