package org.iu.dspwa1022.store.controllers;

import java.util.List;

import org.iu.dspwa1022.store.model.Product;
import org.iu.dspwa1022.store.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @RequestMapping
    public List<Product> getProducts() {
        return repo.findAll();
    }

}
