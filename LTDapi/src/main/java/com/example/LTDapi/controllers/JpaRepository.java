package com.example.LTDapi.controllers;

public interface JpaRepository<User, Long> {
    User findBynome(String nome);

}
