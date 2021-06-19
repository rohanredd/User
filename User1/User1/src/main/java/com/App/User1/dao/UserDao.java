package com.App.User1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.App.User1.Entity.Users;

public interface UserDao extends JpaRepository<Users, Long>{

}
