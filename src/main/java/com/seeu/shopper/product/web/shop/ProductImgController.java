package com.seeu.shopper.product.web.shop;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.product.model.ProductImg;
import com.seeu.shopper.product.service.ProductImgService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/07/29.
*/
@RestController
@RequestMapping("/api/shop/v1/product/img")
public class ProductImgController {
    @Resource
    private ProductImgService productImgService;

    @PostMapping
    public Result add(ProductImg productImg) {
        productImgService.save(productImg);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        productImgService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(ProductImg productImg) {
        productImgService.update(productImg);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ProductImg productImg = productImgService.findById(id);
        return ResultGenerator.genSuccessResult(productImg);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ProductImg> list = productImgService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
