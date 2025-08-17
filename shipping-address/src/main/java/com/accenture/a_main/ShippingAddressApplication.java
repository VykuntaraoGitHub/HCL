package com.accenture.a_main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.accenture")
@EnableJpaRepositories("com.accenture.shipping_address.repository")
public class ShippingAddressApplication implements CommandLineRunner {
	@Autowired
	public  TestDemo testDemo;

	public static void main(String[] args) {
		SpringApplication.run(ShippingAddressApplication.class, args);
		
		System.out.println("--------------Shippig ADRESS---8090-- moidfied--");
		int a=10;
		System.out.println(" int value:"+a);
		int b=a*a;
		System.out.println("b value:"+b);
		System.out.println(" int value square:"+a*a);
		
		String name="Meena Kumari";
		System.out.println("my Wife name:"+name);
		
		System.out.println("-----------calling testdemo method testDemo=");
	
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		  System.out.println("Application started! Executing CommandLineRunner.");
          for (String arg : args) {
              System.out.println("Argument: " + arg);
          }
          
      	testDemo.m1();
		
	}

}
