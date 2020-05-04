package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
/**
 * 
 * @author hemin
 *应用对象
 */

@EnableAdminServer
@SpringBootApplication
public class MyadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyadminApplication.class, args);
	}

}
