package com.exercicios_01.lista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ListaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaApplication.class, args);

		Lista01 lista = new Lista01();
		lista.ex01();

		// public void ex02(){
		// 	String nome;
	
		// 	System.out.println("Escreva seu nome");
	
		// 	nome = scanner.next();
	
		// 	System.out.println("Ola, " + nome);
		// }

		// float conv = 5.25f;
		// float resultconv;
		// float valor;

		// System.out.println("Digite quanto voce deseja converter");

		// valor = scanner.nextFloat();

		// resultconv = valor * conv;

		// System.out.println("O resultado e " +  resultconv);

		// float largura;
		// float comprimento;
		// float valorDoMetro;
		// float area;
		// float valorTerreno;

		// System.out.println("Qual e a largura: ");
		// largura = scanner.nextFloat();
		
		// System.out.println("Qual e o comprimento: ");
		// comprimento = scanner.nextFloat();

		// System.out.println("Qual o valor por metro quadrado: ");
		// valorDoMetro = scanner.nextFloat();


		// area = largura * comprimento;

		// valorTerreno = area * valorDoMetro;

		// System.out.println("O valor e: " + valorTerreno);

		// float km, litro, calc; 

		// System.out.println("informe quantos km:");

		// km = scanner.nextFloat();

		// System.out.println("informe quantos litros vc gastou: ");

		// litro = scanner.nextFloat();

		// calc = km/litro;

		// System.out.println("o resultado e: "+ calc);

		



	}

}
