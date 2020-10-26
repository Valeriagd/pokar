package com.tecmilenio;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {



	public static void main(String[] args) throws Exception{

		Scanner scanner = new Scanner(System.in);
		int option = 0;
		boolean salir = false;

		Deck deck = new Deck();
		deck.crearBaraja();

		while (!salir) {

			System.out.println("Bienvenido a poker!");
			System.out.println("Elige una opción:");
			System.out.println("1. Mezclar Deck");
			System.out.println("2. Sacar una carta");
			System.out.println("3. Carta al azar");
			System.out.println("4. Generar una mano de 5 cartas");
			System.out.println("0. Salir");


			try {
				System.out.println("Introduce un numero");
				option = scanner.nextInt();

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
						throw new IllegalStateException("Opcion invalida " + option);
				}
			} catch (InputMismatchException e) {
				System.out.println("Ingresa una opcion valida");
				scanner.next();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}



	/*Card cr= new Card();
	System.out.println("Cartas");
	cr.carta();*/


	}




