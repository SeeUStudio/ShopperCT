package com.seeu.shopper.product.web.shop;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.product.model.ProductSpecification;
import com.seeu.shopper.product.service.ProductSpecificationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/08/04.
*/
@RestController
@RequestMapping("/api/shop/v1/product/specification")
public class ProductSpecificationController {
    @Resource
    private ProductSpecificationService productSpecificationService;

    @PostMapping
    public Result add(ProductSpecification productSpecification) {
        productSpecificationService.save(productSpecification);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        productSpecificationService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(ProductSpecification productSpecification) {
        productSpecificationService.update(productSpecification);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ProductSpecification productSpecification = productSpecificationService.findById(id);
        return ResultGenerator.genSuccessResult(productSpecification);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ProductSpecification> list = productSpecificationService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
