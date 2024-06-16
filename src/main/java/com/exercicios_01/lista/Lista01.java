package com.exercicios_01.lista;
import java.util.Scanner;

public class Lista01 {
    Scanner scanner = new Scanner(System.in);
    public void ex01(){
        int num1;
        int num2;
        int soma;

        
        System.out.println("Digite um numero: ");
        
        num1 = scanner.nextInt();
    
        System.out.println("Digite um numero: ");

        num2 = scanner.nextInt();

        soma = num1 + num2;

        System.out.println("Resultado: " + soma);
        
    }

    public void ex02(){
		String nome;
	
		System.out.println("Escreva seu nome");
	
		nome = scanner.next();
	
		System.out.println("Ola, " + nome);
	}

    public void ex03(){
        float conv = 5.25f;
		float resultconv;
		float valor;

		System.out.println("Digite quanto voce deseja converter");

		valor = scanner.nextFloat();

		resultconv = valor * conv;

		System.out.println("O resultado e " +  resultconv);
    }

    public void ex04(){
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
    }

}
