package com.zackjinji.springbootmall.service;

import com.zackjinji.springbootmall.dto.ProductRequest;
import com.zackjinji.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
