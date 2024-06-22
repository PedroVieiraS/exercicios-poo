package com.exercicios_01.lista;

import java.util.*;

public class Lista03 {
    Scanner scanner = new Scanner(System.in);

    public void ex01(){
        int tempo;
        boolean certo = true;

        do {
            System.out.println("digite um valor entre 1 e 59:");
            tempo = scanner.nextInt();
    
            if (tempo >= 1 && tempo <= 59){
                certo = false;
            }else {
                System.out.println("Valor invalido");
            }
            
        } while (certo);


        for (int i = tempo; i > 0; i--) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        System.out.println("acabou");
    }

    public void ex02(){
        int numeroUsuario;

        System.out.println("digite um numero");
        numeroUsuario = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroUsuario + " x " + i + " = " + numeroUsuario * i);  
        }
    }

    public void ex03(){
        int num1, num2, numMaior = 0, numMenor = 0;

        System.out.println("digite o primeiro numero:");
        num1 = scanner.nextInt();

        System.out.println("digite o segundo numero:");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            numMaior = num1;
            numMenor = num2;
        }else if (num1 == num2){
            System.out.println("os numeros sao iguais");
        }else{
            numMaior = num2;
            numMenor = num1;
        }
        
        System.out.println("Esses são os numeros pares entre " + numMenor + " e " + numMaior);

        for (int i = numMenor; i < numMaior; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            
        }
    }

    public void ex04(){
        Random randon = new Random();

        int numeroUsuario, numeroRandom, acertar = 1;

        numeroRandom = randon.nextInt(10);

        while(acertar == 1){
            System.out.println("Digite um numero entre 0 e 9");
            numeroUsuario = scanner.nextInt();

            if (numeroRandom == numeroUsuario) {
                System.out.println("acertou");
                System.out.println("O numero random era: " + numeroRandom);
                acertar = 0;
            }else if (numeroRandom > numeroUsuario) {
                System.out.println("o numero e maior");
            } else if(numeroRandom < numeroUsuario){
                System.out.println("o numero e menor");
            } else{
                System.out.println("digite um numero valido");
            }
            
        }


        

    }

    
}
