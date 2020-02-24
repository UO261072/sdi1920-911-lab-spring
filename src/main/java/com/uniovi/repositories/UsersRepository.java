package com.uniovi.repositories;
import com.uniovi.entities.*;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Long>{
	
	
	@Query("SELECT r FROM User r WHERE (LOWER(r.lastName) LIKE LOWER(?1) OR LOWER(r.name) LIKE LOWER(?1))")
	List<User> searchByNameAndSurname(String searchText);
	
	User findByDni(String dni);
	
}
