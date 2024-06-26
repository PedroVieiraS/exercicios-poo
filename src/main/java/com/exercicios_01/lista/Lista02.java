package com.exercicios_01.lista;

import java.util.Scanner;

public class Lista02 {
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

    public void ex08(){

        String[][] perguntas = {
            {
                "Quanto é 2 + 2?",
                "A) 3",
                "B) 4",
                "C) 5",
                "D) 6",
                "B" 
            },
            {
                "Quanto é 5 * 6?",
                "A) 30",
                "B) 35",
                "C) 40",
                "D) 45",
                "A" 
            },
            {
                "Quanto é 9 - 3?",
                "A) 6",
                "B) 7",
                "C) 8",
                "D) 9",
                "A" 
            },
            {
                "Quanto é 15 / 3?",
                "A) 3",
                "B) 4",
                "C) 5",
                "D) 6",
                "C" 
            },
            {
                "Quanto é 7 + 8?",
                "A) 14",
                "B) 15",
                "C) 16",
                "D) 17",
                "B" 
            }
        };

        int erros = 0;
        int acertos = 0;

        for (String[] pergunta : perguntas) {

            System.out.println(pergunta[0]);

            for (int i = 1; i <= 4; i++) {
                System.out.println(pergunta[i]);
            }

            System.out.print("Digite a sua resposta: ");
            String resposta = scanner.nextLine().toUpperCase();

            if (resposta.equals(pergunta[5])) {
                acertos++;
                System.out.println("Resposta correta!");
            } else {
                erros++;
                System.out.println("Resposta errada!");
            }

            if (erros == 3) {
                System.out.println("Você errou 3 vezes. Você perdeu o jogo.");
                
                if(acertos > 1){
                    System.out.println("Número de acertos: " + acertos);
                }

                break;
            }
        }

        if (erros < 3) {
            System.out.println("Você chegou ao final do jogo.");
        }
        System.out.println("Número de acertos: " + acertos);

    }
    
}
