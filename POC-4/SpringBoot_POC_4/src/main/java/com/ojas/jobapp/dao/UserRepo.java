package com.ojas.jobapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.jobapp.domain.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
