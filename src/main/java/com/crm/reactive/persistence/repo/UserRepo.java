package com.crm.reactive.persistence.repo;

import com.crm.reactive.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);

}

