package com.seeu.shopper.product.service.impl;

import com.seeu.shopper.product.dao.ProductParamMapper;
import com.seeu.shopper.product.model.ProductParam;
import com.seeu.shopper.product.service.ProductParamService;
import com.seeu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by neoxiaoyi on 2017/07/29.
 */
@Service
@Transactional
public class ProductParamServiceImpl extends AbstractService<ProductParam> implements ProductParamService {
    @Resource
    private ProductParamMapper productParamMapper;

}
