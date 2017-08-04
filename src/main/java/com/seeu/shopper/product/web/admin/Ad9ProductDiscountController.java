package com.seeu.shopper.product.web.admin;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.product.model.ProductDiscount;
import com.seeu.shopper.product.service.ProductDiscountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/08/04.
*/
@RestController
@RequestMapping("/api/admin/v1/product/discount")
public class Ad9ProductDiscountController {
    @Resource
    private ProductDiscountService productDiscountService;

    @PostMapping
    public Result add(ProductDiscount productDiscount) {
        productDiscountService.save(productDiscount);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        productDiscountService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(ProductDiscount productDiscount) {
        productDiscountService.update(productDiscount);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ProductDiscount productDiscount = productDiscountService.findById(id);
        return ResultGenerator.genSuccessResult(productDiscount);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ProductDiscount> list = productDiscountService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
