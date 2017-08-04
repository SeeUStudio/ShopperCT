package com.seeu.shopper.product.web.admin;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.product.model.ProductCategory;
import com.seeu.shopper.product.service.ProductCategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/08/04.
*/
@RestController
@RequestMapping("/api/admin/v1/product/category")
public class Ad9ProductCategoryController {
    @Resource
    private ProductCategoryService productCategoryService;

    @PostMapping
    public Result add(ProductCategory productCategory) {
        productCategoryService.save(productCategory);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        productCategoryService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(ProductCategory productCategory) {
        productCategoryService.update(productCategory);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ProductCategory productCategory = productCategoryService.findById(id);
        return ResultGenerator.genSuccessResult(productCategory);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ProductCategory> list = productCategoryService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
