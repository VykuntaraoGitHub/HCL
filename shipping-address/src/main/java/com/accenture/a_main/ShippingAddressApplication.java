package com.accenture.a_main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.accenture")
@EnableJpaRepositories("com.accenture.shipping_address.repository")
public class ShippingAddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShippingAddressApplication.class, args);
		
		System.out.println("--------------Shippig ADRESS---8090-- moidfied--");
		int a=10;
		System.out.println(" int value:"+a);
		int b=a*a;
		System.out.println("b value:"+b);
		System.out.println(" int value square:"+a*a);
		
	}
}
