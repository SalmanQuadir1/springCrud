package com.CrudBoot.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.CrudBoot.web.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public List<User> findByName(String name);

	public List<User> findByNameAndCity(String name, String city);

	public List<User> findByNameStartingWith(String prefix);

	public List<User> findByNameEndingWith(String suffix);

	public List<User> findByNameContaining(String word);

//JPQL QUERIES
	@Query("select u FROM User u")
	public List<User> getALlUsers();

	@Query("select u FROM User u WHERE u.name =:n")
	public List<User> getUserByName(@Param("n") String name);

	@Query("select u FROM User u WHERE u.name =:n and u.city=:c")
	public List<User> getUserByNameAndCity(@Param("n") String name, @Param("c") String city);

//NATIVE QUERIES
	@Query(value = "select * FROM User", nativeQuery = true)
	public List<User> getUsers(); 
}
