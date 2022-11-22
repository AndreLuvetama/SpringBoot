package com.securityconfigurejwt.repository;


import com.securityconfigurejwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username= (:username)") //jpql
    public User findByUsername(@Param("username") String username); //verifica se existe o usuário

    boolean existsByUsername(String username);
}