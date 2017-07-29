package com.seeu.shopper.product.service.impl;

import com.seeu.shopper.product.dao.ProductFullReductionMapper;
import com.seeu.shopper.product.model.ProductFullReduction;
import com.seeu.shopper.product.service.ProductFullReductionService;
import com.seeu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by neoxiaoyi on 2017/07/29.
 */
@Service
@Transactional
public class ProductFullReductionServiceImpl extends AbstractService<ProductFullReduction> implements ProductFullReductionService {
    @Resource
    private ProductFullReductionMapper productFullReductionMapper;

}
