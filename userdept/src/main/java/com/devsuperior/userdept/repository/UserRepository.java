package com.devsuperior.userdept.repository;

import com.devsuperior.userdept.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
