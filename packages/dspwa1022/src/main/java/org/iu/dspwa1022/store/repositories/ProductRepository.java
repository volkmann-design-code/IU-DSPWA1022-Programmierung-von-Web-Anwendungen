package org.iu.dspwa1022.store.repositories;

import org.iu.dspwa1022.store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
