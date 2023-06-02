package com.educandoweb.demo.repositories;

import com.educandoweb.demo.entities.Category;
import com.educandoweb.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}
