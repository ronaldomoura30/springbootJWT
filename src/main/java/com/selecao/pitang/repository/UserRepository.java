package com.selecao.pitang.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selecao.pitang.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{

}
