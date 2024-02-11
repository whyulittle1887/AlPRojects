package com.mycompany.product.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.product.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>
{
    List<Product> findByCatId(int catId);

}
