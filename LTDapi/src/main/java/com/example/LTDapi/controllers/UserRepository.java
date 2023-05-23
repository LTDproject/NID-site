package com.example.LTDapi.controllers;

import com.example.LTDapi.controllers.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findBynome(String nome);

}
