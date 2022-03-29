package com.wzf.mybatis.mapper.secondary;

import com.wzf.mybatis.entity.Product;

import java.util.List;

/**
 * ProductMapper
 *
 */
public interface ProductMapper {

  List<Product> findAllProduct();

  void insertProduct(Product product);
}
