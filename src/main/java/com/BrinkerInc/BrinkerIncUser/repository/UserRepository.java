package com.BrinkerInc.BrinkerIncUser.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BrinkerInc.BrinkerIncUser.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable>{

}
