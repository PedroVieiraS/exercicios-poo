package com.exercicios_01.lista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ListaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaApplication.class, args);

		Lista01 lista = new Lista01();
		
		// lista.ex01();
		// lista.ex02();
		//lista.ex03();
		//lista.ex04();
		lista.ex05();

	}

}
