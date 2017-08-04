package com.seeu.shopper.product.service.impl;

import com.seeu.shopper.product.dao.ProductSpecificationMapper;
import com.seeu.shopper.product.model.ProductSpecification;
import com.seeu.shopper.product.service.ProductSpecificationService;
import com.seeu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by neoxiaoyi on 2017/08/04.
 */
@Service
@Transactional
public class ProductSpecificationServiceImpl extends AbstractService<ProductSpecification> implements ProductSpecificationService {
    @Resource
    private ProductSpecificationMapper productSpecificationMapper;

}
