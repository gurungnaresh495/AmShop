package com.ecom.AmShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.ecom.AmShop.DAO")
@ComponentScan(basePackages={"com.ecom.AmShop.Configuration", "com.ecom.AmShop.Service", "com.ecom.AmShop.Controller", "com.ecom.AmShop.Model"})
public class AmShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmShopApplication.class, args);
	}

}
