package com.bdpietroo.product_catolog_api.repositories;

import com.bdpietroo.product_catolog_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
