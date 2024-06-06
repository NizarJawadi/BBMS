package com.rabta.BBMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.rabta.BBMS.model.Roles;
import com.rabta.BBMS.model.User;
import com.rabta.BBMS.services.UserServicesImpl;



@SpringBootApplication(scanBasePackages = "com.rabta.BBMS")

public class BbmsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbmsProjectApplication.class, args);
	}
	

	/* @Bean 
		CommandLineRunner start (UserServicesImpl userServicesImpl )
				
		{ return args ->{
			User user1 = new User(5L,"21445221","0000",Roles.ADMIN);
			userServicesImpl.addUser(user1);
			
		};
		
	    }
	    
	    */
	 

}
