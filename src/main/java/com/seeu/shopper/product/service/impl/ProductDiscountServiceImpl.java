package com.seeu.shopper.product.service.impl;

import com.seeu.shopper.product.dao.ProductDiscountMapper;
import com.seeu.shopper.product.model.ProductDiscount;
import com.seeu.shopper.product.service.ProductDiscountService;
import com.seeu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by neoxiaoyi on 2017/08/04.
 */
@Service
@Transactional
public class ProductDiscountServiceImpl extends AbstractService<ProductDiscount> implements ProductDiscountService {
    @Resource
    private ProductDiscountMapper productDiscountMapper;

}
