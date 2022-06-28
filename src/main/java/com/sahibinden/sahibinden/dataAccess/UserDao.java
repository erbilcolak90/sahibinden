package com.sahibinden.sahibinden.dataAccess;

import com.sahibinden.sahibinden.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
