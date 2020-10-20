package com.tecmilenio;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {



	public static void main(String[] args)  {

		int option = 0;
		int ciclo = 0;

		Deck deck = new Deck();
		deck.crearBaraja();
		do {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bienvenido a poker!");
		System.out.println("Elige una opción:");
		System.out.println("1. Mezclar Deck");
		System.out.println("2. Sacar una carta");
		System.out.println("3. Carta al azar");
		System.out.println("4. Generar una mano de 5 cartas");
		System.out.println("0. Salir");
		option= scanner.nextInt();


			switch (option) {

				case 1:
					deck.descomponer();
					break;

				case 2:
					deck.head();
					break;

				case 3:
					deck.pick();
					break;

				case 4:
					deck.hand();
					break;

				case 0:
					System.out.println("Gracias. Adios");
					break;

				default:
					System.out.println("Opcion invalida");
					break;

			}
		} while (option != 0);




	/*Card cr= new Card();
	System.out.println("Cartas");
	cr.carta();*/


	}
}



