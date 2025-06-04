package com.bdpietroo.product_catolog_api.repositories;

import com.bdpietroo.product_catolog_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
