package com.exercicios_01.lista;

import java.util.*;

public class Lista04 {

    Scanner scanner = new Scanner(System.in);


    public void ex01(){
        float vendas[] = {3.99f, 5.50f, 6.75f};
        float soma = 0;

        for (int i = 0; i < vendas.length; i++) {
            soma = vendas[i] + soma;
        }

        System.out.println(" a soma de vendas do dia e: " + soma);
    }

    public void ex02(){
        float vendas[] = {3.99f, 5.50f, 6.75f};
        float numeroMaior = 0;
        float numeroMenor = vendas[0];

        for (int i = 0; i < vendas.length; i++) {
            if(vendas[i] > numeroMaior){
                numeroMaior = vendas[i];
            }
            if (vendas[i] < numeroMenor) {
                numeroMenor = vendas[i];
            }
        }

        System.out.println(numeroMaior);
        System.out.println(numeroMenor);
    }

    public void ex03(){
        float vendas[] = {3.99f, 5.50f, 6.75f};
        float soma = 0;
        float media = 0;

        for (int i = 0; i < vendas.length; i++) {
            soma = vendas[i] + soma;
        }

        media = soma/vendas.length;
    }

}
