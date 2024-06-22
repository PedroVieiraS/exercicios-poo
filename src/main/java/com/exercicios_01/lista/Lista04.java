package com.exercicios_01.lista;

import java.util.*;

public class Lista04 {

    Scanner scanner = new Scanner(System.in);

    public void ex01() {
        float vendas[] = { 3.99f, 5.50f, 6.75f };
        float soma = 0;

        for (int i = 0; i < vendas.length; i++) {
            soma = vendas[i] + soma;
        }

        System.out.println(" a soma de vendas do dia e: " + soma);
    }

    public void ex02() {
        float vendas[] = { 3.99f, 5.50f, 6.75f };
        float numeroMaior = 0;
        float numeroMenor = vendas[0];

        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] > numeroMaior) {
                numeroMaior = vendas[i];
            }
            if (vendas[i] < numeroMenor) {
                numeroMenor = vendas[i];
            }
        }

        System.out.println(numeroMaior);
        System.out.println(numeroMenor);
    }

    public void ex03() {
        float vendas[] = { 3.99f, 5.50f, 6.75f };
        float soma = 0;
        float media = 0;

        for (int i = 0; i < vendas.length; i++) {
            soma = vendas[i] + soma;
        }

        media = soma / vendas.length;

        String formattedMedia = String.format("%.2f", media);
        System.out.println(formattedMedia);

        System.out.println(media);
    }

    public void ex04() {
        int lista[] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };
        int quantidade = 0;

        for (int i = 0; i < lista.length; i++) {
            if ((lista[i] % 2) == 0) {
                quantidade++;
                System.out.println(lista[i]);
            }
        }

        System.out.println("a quantidade de numeros pares e: " + quantidade);
    }

    public void lista() {
        String nome;
        int i = 0;
        boolean menu = true;
        int opcao;

        ArrayList<String> listaDeCompras = new ArrayList<>();

        while (menu) {

            System.out.println(" Menu:");
            System.out.println("1) Adicionar");
            System.out.println("2) Remover");
            System.out.println("3) Colocar preco");
            System.out.println("4) imprimir Lista");
            System.out.println("5) Sair");

            System.out.println("digite um numero:");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("EScreva um item");
                nome = scanner.next();
                listaDeCompras.add(nome);
                i++;
            } else if (opcao == 4) {
                System.out.println(listaDeCompras);
            } else if (opcao == 5) {
                menu = false;
            } else {
                System.out.println("numero invalido");
            }

        }
    }

}
