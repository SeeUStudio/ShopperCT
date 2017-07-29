package com.seeu.shopper.product.web.admin;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.product.model.ProductStock;
import com.seeu.shopper.product.service.ProductStockService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/07/29.
*/
@RestController
@RequestMapping("/api/admin/v1/product/stock")
public class Ad9ProductStockController {
    @Resource
    private ProductStockService productStockService;

    @PostMapping
    public Result add(ProductStock productStock) {
        productStockService.save(productStock);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        productStockService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(ProductStock productStock) {
        productStockService.update(productStock);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ProductStock productStock = productStockService.findById(id);
        return ResultGenerator.genSuccessResult(productStock);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ProductStock> list = productStockService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
