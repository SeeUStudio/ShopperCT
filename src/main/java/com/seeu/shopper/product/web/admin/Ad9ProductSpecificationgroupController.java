package com.seeu.shopper.product.web.admin;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.product.model.ProductSpecificationgroup;
import com.seeu.shopper.product.service.ProductSpecificationgroupService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/07/29.
*/
@RestController
@RequestMapping("/api/admin/v1/product/specificationgroup")
public class Ad9ProductSpecificationgroupController {
    @Resource
    private ProductSpecificationgroupService productSpecificationgroupService;

    @PostMapping
    public Result add(ProductSpecificationgroup productSpecificationgroup) {
        productSpecificationgroupService.save(productSpecificationgroup);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        productSpecificationgroupService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(ProductSpecificationgroup productSpecificationgroup) {
        productSpecificationgroupService.update(productSpecificationgroup);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ProductSpecificationgroup productSpecificationgroup = productSpecificationgroupService.findById(id);
        return ResultGenerator.genSuccessResult(productSpecificationgroup);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ProductSpecificationgroup> list = productSpecificationgroupService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
