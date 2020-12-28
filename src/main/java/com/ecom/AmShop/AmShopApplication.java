package com.ecom.AmShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ecom.AmShop.DAO"})
public class AmShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmShopApplication.class, args);
	}

}
