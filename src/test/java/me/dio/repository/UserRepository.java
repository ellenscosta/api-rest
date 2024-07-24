package me.dio.repository;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import me.dio.model.User;

@Repository
public class UserRepository extends SimpleJpaRepository<User, Long> {

	public UserRepository(Class<User> domainClass, EntityManager entityManager) {
		super(domainClass, entityManager);
		// TODO Auto-generated constructor stub
	}


}
