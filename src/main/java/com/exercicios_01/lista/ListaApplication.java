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
		lista.ex04();

		
		

		// float km, litro, calc; 

		// System.out.println("informe quantos km:");

		// km = scanner.nextFloat();

		// System.out.println("informe quantos litros vc gastou: ");

		// litro = scanner.nextFloat();

		// calc = km/litro;

		// System.out.println("o resultado e: "+ calc);

		



	}

}
