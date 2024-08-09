package com.summa.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.summa.spring.entity.entity;

@Repository
public interface repository extends JpaRepository<entity, Long> {

	entity findByEmail(String email);


}

