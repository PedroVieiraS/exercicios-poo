package com.exercicios_01.lista;

import java.util.*;

public class Lista03 {
    Scanner scanner = new Scanner(System.in);

    public void ex01(){
        Timer timer = new Timer();

        int tempo;
        boolean certo = true;

        do {
            System.out.println("digite um valor entre 1 e 59:");
            tempo = scanner.nextInt();
    
            if (tempo > 0 && tempo <= 59){
                certo = false;
            }else {
                System.out.println("Valor invalido");
            }
            
        } while (certo);


        for (int i = tempo; i > 0; i--) {
            
            System.out.println(i);
        }
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
        // int num1, num2, numMaior, numMenor;

        // System.out.println("digite o primeiro numero:");
        // num1 = scanner.nextInt();

        // System.out.println("digite o segundo numero:");
        // num2 = scanner.nextInt();

        // if (num1 > num2) {
        //     num1 = numMaior;
        //     num2 = numMenor;
        // }else if (num1 == num2){

        // }

        // for (int i = num1; i < num2; i++) {

        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //     }
            
        // }
    }
}
