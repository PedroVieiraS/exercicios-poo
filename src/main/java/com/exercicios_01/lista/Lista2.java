package com.exercicios_01.lista;

import java.util.Scanner;

public class Lista2 {
    Scanner scanner = new Scanner(System.in);

    public void ex01(){
        int numero;

        System.out.println("Digite um numero:");

        numero = scanner.nextInt();


        if (numero == 0) {
            System.out.println(numero);
        }else if (numero % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }

    public void ex02(){
        int num1, num2;

        System.out.println("Escreva um numero:");
        num1 = scanner.nextInt();

        System.out.println("Escreva um numero:");
        num2 = scanner.nextInt();

        if(num1 > num2){ 
            System.out.println("O numero "+ num1 + " e maior que o numero "+ num2);
        }else{
            System.out.println("O numero "+ num2 + " e maior que o numero "+ num1);
        }
    }

    public void ex03(){
        String idoso;
        String gestante;
        String deficiente;
        String sim = "s";

        System.out.println("Voce e tem mais de 65 anos? s/n");

        idoso = scanner.nextLine();

        if (idoso.equals(sim)) {
            System.out.println("Fila Preferencial");
        }else{
            System.out.println("Voce e gestante? s/n");
            gestante = scanner.nextLine();
            if (gestante.equals(sim)) {
                System.out.println("Fila Preferencial");
            }else{
                System.out.println("Voce e deficiente? s/n");
                deficiente = scanner.nextLine();
                if (deficiente.equals(sim)) {
                    System.out.println("Fila Preferencial");
                }else{
                    System.out.println("Fila normal");
                }
            }
        }
    }

    public void ex04(){
        int idade;

        System.out.println("Qual Sua Idade?");

        idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Pessoas com menos de 16 anos não podem entrar no evento");
        }else if (idade >= 16 && idade < 18){
            System.out.println("somente acompanhado pelos responsáveis.");
        }else{
            System.out.println("Bem vindo");
        }
    }

    public void ex05(){
        String usuario, senha, usuarioVerificado = "pedro", senhaVerificado = "1234";

        System.out.println("Digite seu usuario:");

        usuario = scanner.next();

        System.out.println("Digite sua senha:");

        senha = scanner.next();

        if(usuario.equals(usuarioVerificado) && senha.equals(senhaVerificado)){
            System.out.println("Bem vindo");
        }else{
            if (!(senha.equals(senhaVerificado)) &&  !(usuario.equals(usuarioVerificado))) {
                System.out.println("Login e senha errados"); 
             }else if (!(senha.equals(senhaVerificado))){
                 System.out.println("senha errada");
             }else{
                 System.out.println("login errado");
             }
            
        }
    }

    public void ex06(){
        Float nota1, nota2, recuperacao, media, notaAtual;

        System.out.println("digite sua nota");
        nota1 = scanner.nextFloat();

        System.out.println("digite sua nota");
        nota2 = scanner.nextFloat();

        media = (nota1 + nota2) / 2;

        
        if (media < 6) {
            System.out.println("Digite a sua nota de recuperacao:");
            recuperacao = scanner.nextFloat();

            if (nota2 == nota1) {
                media = (recuperacao + nota2) / 2;
            }else if (nota1 > recuperacao){
                media = (nota1 + recuperacao) / 2;
            }else{
                media = (recuperacao + nota2) / 2;
            }

            

            if(media >= 6){
                System.out.println("Aprovado na recuperacao " + media);
            }else{
                System.out.println("reprovado " + media);
            }
            
        }else{
            System.out.println(" Aprovado " + media);
        }
    }

    public void ex07(){
        int numeroX, numeroUsuario;

        System.out.println("Digite o numero X: ");
        numeroX = scanner.nextInt();

        System.out.println("Digite o numero que sera dividido por X: ");
        numeroUsuario = scanner.nextInt();

        if (numeroUsuario % numeroX ==  0) {
            System.out.println("Divisivel");
        }else{
            System.out.println("Nao Divisivel");
        }
    }
    
}
