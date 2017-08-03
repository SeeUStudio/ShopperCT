package com.seeu.shopper.admin.service.impl;

import com.seeu.shopper.admin.dao.AdminMapper;
import com.seeu.shopper.admin.model.Admin;
import com.seeu.shopper.admin.service.AdminService;
import com.seeu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by neoxiaoyi on 2017/08/04.
 */
@Service
@Transactional
public class AdminServiceImpl extends AbstractService<Admin> implements AdminService {
    @Resource
    private AdminMapper adminMapper;

}
