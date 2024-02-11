package com.mycompany.product;

import com.mycompany.product.dao.ProductRepository;
import com.mycompany.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Service
@RequestMapping("/api/v1")
public class RoutesV1
{
    @Autowired
    ProductRepository prodRepo;

    @GetMapping("/")
    public String index()
    {
        return "this is the root of the api";
    }

    @RequestMapping("/product/{ID}")
    Optional<Product> getProduct(@PathVariable("ID") int ID)
    {
//        return new Product(ID);
        return prodRepo.findById(ID);
    }

    @RequestMapping("/productIDs")
    List<Product> getProductIDs(@RequestParam int catID)
    {
//        return Arrays.asList(ID + 1, ID + 2, ID + 3);
        return prodRepo.findByCatID(catID);
    }

    // POST
    @RequestMapping(value = "/product", method = RequestMethod.POST)
    ResponseEntity insertProduct(@RequestBody Product product)
    {
        Product savedProduct = prodRepo.save(product);
        return new ResponseEntity<Product>(savedProduct, HttpStatus.OK);
    }

    // PUT
    @RequestMapping(value = "/product/{ID}", method = RequestMethod.PUT)
    Product updateProduct(@PathVariable("ID") int ID, @RequestBody Product product)
    {
        Optional<Product> optionalProduct = prodRepo.findById(ID);
        Product existingProduct = optionalProduct.get();

        existingProduct.setCatID(product.getCatID());
        existingProduct.setName(product.getName());
        Product savedProduct = prodRepo.save(existingProduct);

        return savedProduct;
    }


    // DELETE
    @RequestMapping(value = "/product/{ID}", method = RequestMethod.DELETE)
    Product deleteProduct(@PathVariable("ID") int ID)
    {
        Optional<Product> optionalProduct = prodRepo.findById(ID);
        Product existingProduct = optionalProduct.get();
        prodRepo.delete(existingProduct);
        return existingProduct;
    }
}
