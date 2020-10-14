package com.tecmilenio;

public class Main {

    public static void main(String[] args) {

	Deck deck = new Deck();
	deck.crearBaraja();


	deck.descomponer();
	deck.head();
	deck.pick();
	deck.hand();



	/*Card cr= new Card();
	System.out.println("Cartas");
	cr.carta();*/
    }
}
