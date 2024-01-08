package com.javafinal.WebMail.Repo;

import com.javafinal.WebMail.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findUserByEmail(String email);
    User findByEmail(String email);
}
