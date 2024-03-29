package com.dk.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dk.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
