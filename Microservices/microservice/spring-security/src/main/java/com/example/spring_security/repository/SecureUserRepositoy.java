package com.example.spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_security.bean.SecureUser;

@Repository
public interface SecureUserRepositoy extends JpaRepository<SecureUser, Integer>{
	SecureUser findByUserName(String userName);

}
