package com.mycompany.product;


import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mycompany.product.dao.ProductRepository;
import com.mycompany.product.entity.Product;

@RestController
@Service
public class ProductService
{

    @Autowired
    ProductRepository prodRepo;

    @RequestMapping("/products/{id}")
    Optional<Product> getProduct(@PathVariable("id") Long id)
    {
        return prodRepo.findById(id);
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    List<Product> getProductForCategory(@RequestParam(value = "catId") int catId)
    {
        return prodRepo.findByCatId(catId);
    }


    @RequestMapping(value = "/products", method = RequestMethod.POST)
    ResponseEntity<Product> insertProduct(@RequestBody Product product)
    {
        Product savedProduct = prodRepo.save(product);
        return new ResponseEntity<Product>(savedProduct, HttpStatus.OK);
    }

    //Return a link
//	@RequestMapping(value="/products", method = RequestMethod.POST)
//	ResponseEntity<Product> insertProduct(@Valid @RequestBody Product product) {
//		Product savedProduct = prodRepo.save(product) ;
//		URI location= ServletUriComponentsBuilder
//				.fromCurrentRequest().path("/{id}")
//				.buildAndExpand(savedProduct.getId())
//				.toUri();
//		return ResponseEntity.created(location).build() ;		
//	}

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product)
    {

        // First fetch an existing product and then modify it.
        Optional<Product> optionalProduct = prodRepo.findById(id);
        Product existingProduct = optionalProduct.get();
        // Now update it back
        existingProduct.setCatId(product.getCatId());
        existingProduct.setName(product.getName());
        Product savedProduct = prodRepo.save(existingProduct);

        // Return the updated product
        return savedProduct;
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    Product deleteProduct(@PathVariable("id") Long id)
    {

        // First fetch an existing product and then delete it.
        Optional<Product> optionalProduct = prodRepo.findById(id);
        Product existingProduct = optionalProduct.get();
        // Return the deleted product
        prodRepo.delete(existingProduct);
        return existingProduct;
    }


}
