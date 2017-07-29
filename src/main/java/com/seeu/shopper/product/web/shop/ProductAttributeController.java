package com.seeu.shopper.product.web.shop;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.product.model.ProductAttribute;
import com.seeu.shopper.product.service.ProductAttributeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/07/29.
*/
@RestController
@RequestMapping("/api/shop/v1/product/attribute")
public class ProductAttributeController {
    @Resource
    private ProductAttributeService productAttributeService;

    @PostMapping
    public Result add(ProductAttribute productAttribute) {
        productAttributeService.save(productAttribute);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        productAttributeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(ProductAttribute productAttribute) {
        productAttributeService.update(productAttribute);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ProductAttribute productAttribute = productAttributeService.findById(id);
        return ResultGenerator.genSuccessResult(productAttribute);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ProductAttribute> list = productAttributeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
