package com.exercicios_01.lista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ListaApplication {
	public class LimpaTerminal {
		static void limpa_windows() {
			try {
				if (System.getProperty("os.name").contains("Windows")) {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} else {
					System.out.println("Este comando só funciona no Windows.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		SpringApplication.run(ListaApplication.class, args);

		Lista01 lista = new Lista01();
		Lista02 lista2 = new Lista02();
		Lista03 lista3 = new Lista03();
		Lista04 lista4 = new Lista04();

		LimpaTerminal.limpa_windows();
		lista4.ex05();

	}



}
