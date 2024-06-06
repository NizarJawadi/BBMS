package com.rabta.BBMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User  {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser ;
	private String matricule ;
	private String password ;
    @Enumerated(EnumType.STRING)
	private Roles role ;

	
}
