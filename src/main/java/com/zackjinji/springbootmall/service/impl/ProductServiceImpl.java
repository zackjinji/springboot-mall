package com.zackjinji.springbootmall.service.impl;

import com.zackjinji.springbootmall.dao.ProductDao;
import com.zackjinji.springbootmall.model.Product;
import com.zackjinji.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
