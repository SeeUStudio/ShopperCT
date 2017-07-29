package com.seeu.shopper.demo.web.shop;

import com.seeu.core.Result;
import com.seeu.core.ResultGenerator;
import com.seeu.shopper.demo.model.Demo;
import com.seeu.shopper.demo.service.DemoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by neoxiaoyi on 2017/07/27.
*/
@RestController
@RequestMapping("/api/shop/v1/demo")
public class DemoController {
    @Resource
    private DemoService demoService;

    @PostMapping
    public Result add(Demo demo) {
        demoService.save(demo);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        demoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(Demo demo) {
        demoService.update(demo);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Demo demo = demoService.findById(id);
        return ResultGenerator.genSuccessResult(demo);
    }

    @GetMapping
    public Result list(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<Demo> list = demoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
