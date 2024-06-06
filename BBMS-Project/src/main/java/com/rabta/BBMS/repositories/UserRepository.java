package com.rabta.BBMS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabta.BBMS.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findUserByMatricule(String matricule);

	User findUserByIdUser(Long idUser);
}
