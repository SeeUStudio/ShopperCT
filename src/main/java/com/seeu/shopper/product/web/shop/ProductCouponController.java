package com.seeu.shopper.product.web.shop;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.product.model.ProductCoupon;
import com.seeu.shopper.product.service.ProductCouponService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/07/29.
*/
@RestController
@RequestMapping("/api/shop/v1/product/coupon")
public class ProductCouponController {
    @Resource
    private ProductCouponService productCouponService;

    @PostMapping
    public Result add(ProductCoupon productCoupon) {
        productCouponService.save(productCoupon);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        productCouponService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(ProductCoupon productCoupon) {
        productCouponService.update(productCoupon);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ProductCoupon productCoupon = productCouponService.findById(id);
        return ResultGenerator.genSuccessResult(productCoupon);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ProductCoupon> list = productCouponService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
