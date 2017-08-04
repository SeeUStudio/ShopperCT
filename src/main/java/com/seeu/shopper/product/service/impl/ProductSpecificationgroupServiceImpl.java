package com.seeu.shopper.product.service.impl;

import com.seeu.shopper.product.dao.ProductSpecificationgroupMapper;
import com.seeu.shopper.product.model.ProductSpecificationgroup;
import com.seeu.shopper.product.service.ProductSpecificationgroupService;
import com.seeu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by neoxiaoyi on 2017/08/04.
 */
@Service
@Transactional
public class ProductSpecificationgroupServiceImpl extends AbstractService<ProductSpecificationgroup> implements ProductSpecificationgroupService {
    @Resource
    private ProductSpecificationgroupMapper productSpecificationgroupMapper;

}
