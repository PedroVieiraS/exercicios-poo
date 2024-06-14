package com.exercicios_01.lista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ListaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaApplication.class, args);
		Scanner scanner = new Scanner(System.in);

		int num1;
		int num2;
		int soma;

		System.out.println("Bem vindo");

		System.out.println("Digite um numero:");

		num1 = scanner.nextInt();

		System.out.println("Digite outro numero:");

		num2 = scanner.nextInt();

		soma = num1 + num2;

		System.out.println("O resultado da soma e: "+soma);

		String nome;

		System.out.println("Escreva seu nome");

		nome = scanner.next();

		System.out.println("Ola, " + nome);

		float conv = 5.25f;
		float resultconv;
		float valor;

		System.out.println("Digite quanto voce deseja converter");

		valor = scanner.nextFloat();

		resultconv = valor * conv;

		System.out.println("O resultado e " +  resultconv);

		float largura;
		float comprimento;
		float valorDoMetro;
		float area;
		float valorTerreno;

		System.out.println("Qual e a largura: ");
		largura = scanner.nextFloat();
		
		System.out.println("Qual e o comprimento: ");
		comprimento = scanner.nextFloat();

		System.out.println("Qual o valor por metro quadrado: ");
		valorDoMetro = scanner.nextFloat();


		area = largura * comprimento;

		valorTerreno = area * valorDoMetro;

		System.out.println("O valor e: " + valorTerreno);

		float km, litro, calc; 

		System.out.println("informe quantos km:");

		km = scanner.nextFloat();

		System.out.println("informe quantos litros vc gastou: ");

		litro = scanner.nextFloat();

		calc = km/litro;

		System.out.println("o resultado e: "+ calc);


		scanner.close();
		



	}

}
