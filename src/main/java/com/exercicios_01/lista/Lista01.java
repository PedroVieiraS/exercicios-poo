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
    
        System.out.println("Digite outro numero: ");

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

		System.out.println("Digite quanto voce tem em reais");

		valor = scanner.nextFloat();

		resultconv = valor / conv;

		System.out.println("Esse e o resultado em dolar: " +  resultconv);
    }

    public void ex04(){
        float numeroleia;

        System.out.println("Escreva um numero:");

        numeroleia = scanner.nextFloat();

        float antecessor = numeroleia - 1;
        float sucessor = numeroleia + 1;

        System.out.println("O antecessor e: "+ (antecessor)  +"O Sucessor e: "+ sucessor);
    }

    public void ex05(){
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

    public void ex06(){
        float km, litro, calc; 

		System.out.println("informe quantos km:");

		km = scanner.nextFloat();

		System.out.println("informe quantos litros vc gastou: ");

		litro = scanner.nextFloat();

		calc = km/litro;

		System.out.println("o resultado e: "+ calc);
    }

    public void ex07(){
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;

        System.out.println("Digite a sua primera nota: ");
        nota1 = scanner.nextFloat();

        System.out.println("Digite a sua segunda nota: ");
        nota2 = scanner.nextFloat();

        System.out.println("Digite a sua terceira nota: ");
        nota3 = scanner.nextFloat();

        System.out.println("Digite a sua quarta nota: ");
        nota4 = scanner.nextFloat();

        media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A sua media final e: " + media);
    }

    public void ex08(){
        float temperatura;
        double converter;

        System.out.println("informe a temperatura em Fahrenheit: ");

        temperatura = scanner.nextFloat();

        converter = (temperatura - 32) / 1.8;

        System.out.println(converter);
    }

}
