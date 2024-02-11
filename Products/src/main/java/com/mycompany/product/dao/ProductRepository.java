package com.mycompany.product.dao;

import com.mycompany.product.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>
{
    List<Product> findByCatID(int catID);
}
