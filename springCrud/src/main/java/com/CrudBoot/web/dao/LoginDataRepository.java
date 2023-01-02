package com.CrudBoot.web.dao;

import org.springframework.data.repository.CrudRepository;

import com.CrudBoot.web.entities.LoginData;

public interface LoginDataRepository extends CrudRepository<LoginData, Integer> {

}
