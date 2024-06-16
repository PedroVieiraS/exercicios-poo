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
}
