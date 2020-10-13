package com.tecmilenio;

public class Main {

    public static void main(String[] args) {
	Deck de= new Deck();
	System.out.println("Deck de cartas");
	de.mazo();
	Card cr= new Card();
	System.out.println("Cartas");
	cr.carta();
    }
}
