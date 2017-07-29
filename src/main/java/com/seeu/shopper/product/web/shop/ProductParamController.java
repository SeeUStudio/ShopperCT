package com.seeu.shopper.product.web.shop;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.product.model.ProductParam;
import com.seeu.shopper.product.service.ProductParamService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/07/29.
*/
@RestController
@RequestMapping("/api/shop/v1/product/param")
public class ProductParamController {
    @Resource
    private ProductParamService productParamService;

    @PostMapping
    public Result add(ProductParam productParam) {
        productParamService.save(productParam);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        productParamService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(ProductParam productParam) {
        productParamService.update(productParam);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ProductParam productParam = productParamService.findById(id);
        return ResultGenerator.genSuccessResult(productParam);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ProductParam> list = productParamService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
