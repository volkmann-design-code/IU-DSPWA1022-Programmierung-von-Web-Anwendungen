package org.iu.dspwa1022.store.controllers;

import java.util.List;
import java.util.UUID;

import org.iu.dspwa1022.store.model.Customer;
import org.iu.dspwa1022.store.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @RequestMapping
    public List<Customer> findAll() {
        return repo.findAll();
    }

    @RequestMapping("/{id}")
    public Customer findById(@PathVariable UUID id) {
        return repo.findById(id).orElse(null);
    }

}
