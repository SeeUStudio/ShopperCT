package com.seeu.shopper.demo.service.impl;

import com.seeu.shopper.demo.dao.DemoMapper;
import com.seeu.shopper.demo.model.Demo;
import com.seeu.shopper.demo.service.DemoService;
import com.seeu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by neoxiaoyi on 2017/07/27.
 */
@Service
@Transactional
public class DemoServiceImpl extends AbstractService<Demo> implements DemoService {
    @Resource
    private DemoMapper demoMapper;

}
