package com.seeu.shopper.product.service.impl;

import com.seeu.shopper.product.dao.ProductCouponMapper;
import com.seeu.shopper.product.model.ProductCoupon;
import com.seeu.shopper.product.service.ProductCouponService;
import com.seeu.core.AbstractService;
import com.seeu.util.CSVUtils;
import com.seeu.util.CopCreater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by neoxiaoyi on 2017/08/04.
 */
@Service
@Transactional
public class ProductCouponServiceImpl extends AbstractService<ProductCoupon> implements ProductCouponService {
    @Resource
    private ProductCouponMapper productCouponMapper;
    public void exportCSV(String cid, int start, int count){
        List exportData = new ArrayList<Map>();
        CopCreater copCreater = new CopCreater();
        Map row1;
        copCreater.create(cid, start, count);
        List<String> code = copCreater.getList();
        for(int i=0; i<count; i++){
            row1 = new LinkedHashMap<String, String>();
            row1.put("1", code.get(i));
            exportData.add(row1);
        }
        LinkedHashMap map = new LinkedHashMap();
        map.put("1", "code");


        String path = "c:/export/";
        String fileName = "code";
        File file = CSVUtils.createCSVFile(exportData, map, path, fileName);
        String fileName2 = file.getName();
        System.out.println("文件名称：" + fileName2);
    }

}
