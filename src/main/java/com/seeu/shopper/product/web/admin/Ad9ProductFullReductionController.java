package com.seeu.shopper.product.web.admin;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.product.model.ProductFullReduction;
import com.seeu.shopper.product.service.ProductFullReductionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/07/29.
*/
@RestController
@RequestMapping("/api/admin/v1/product/full/reduction")
public class Ad9ProductFullReductionController {
    @Resource
    private ProductFullReductionService productFullReductionService;

    @PostMapping
    public Result add(ProductFullReduction productFullReduction) {
        productFullReductionService.save(productFullReduction);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        productFullReductionService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(ProductFullReduction productFullReduction) {
        productFullReductionService.update(productFullReduction);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ProductFullReduction productFullReduction = productFullReductionService.findById(id);
        return ResultGenerator.genSuccessResult(productFullReduction);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ProductFullReduction> list = productFullReductionService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
