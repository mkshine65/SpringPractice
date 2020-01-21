package com.example.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ApplicationContext appcontext=SpringApplication.run(Application.class, args);
		BinarySearchImpl binarysearch = appcontext.getBean(BinarySearchImpl.class);
		int result=binarysearch.binarySearch(new int[] {1, 2,3},3);
		System.out.println("Rslt"+result);
	}

}
