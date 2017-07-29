package com.seeu.shopper.product.service.impl;

import com.seeu.shopper.product.dao.ProductTagMapper;
import com.seeu.shopper.product.model.ProductTag;
import com.seeu.shopper.product.service.ProductTagService;
import com.seeu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by neoxiaoyi on 2017/07/29.
 */
@Service
@Transactional
public class ProductTagServiceImpl extends AbstractService<ProductTag> implements ProductTagService {
    @Resource
    private ProductTagMapper productTagMapper;

}
