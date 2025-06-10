package com.zackjinji.springbootmall.dao;

import com.zackjinji.springbootmall.dto.ProductRequest;
import com.zackjinji.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
