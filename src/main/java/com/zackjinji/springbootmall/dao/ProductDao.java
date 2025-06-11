package com.zackjinji.springbootmall.dao;

import com.zackjinji.springbootmall.constant.ProductCategory;
import com.zackjinji.springbootmall.dto.ProductQueryParams;
import com.zackjinji.springbootmall.dto.ProductRequest;
import com.zackjinji.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}

