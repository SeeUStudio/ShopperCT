package com.seeu.shopper.product.web.shop;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.product.model.ProductIntro;
import com.seeu.shopper.product.service.ProductIntroService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/07/29.
*/
@RestController
@RequestMapping("/api/shop/v1/product/intro")
public class ProductIntroController {
    @Resource
    private ProductIntroService productIntroService;

    @PostMapping
    public Result add(ProductIntro productIntro) {
        productIntroService.save(productIntro);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        productIntroService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(ProductIntro productIntro) {
        productIntroService.update(productIntro);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ProductIntro productIntro = productIntroService.findById(id);
        return ResultGenerator.genSuccessResult(productIntro);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ProductIntro> list = productIntroService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
