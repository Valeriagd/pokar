package com.tecmilenio;

import java.util.ArrayList;

public class Deck {

    private Card cartas[];
    private int posSiguienteCarta;

    public void mazo() {

        int Numcartas = 52;

        this.cartas = new Card[Numcartas];
        this.posSiguienteCarta = 0;


    }


    private void crearBaraja(){

        String[] palos=Card.PALOS;

        for(int i=0; i<palos.length; i++){

            for(int j=0; j<Card.LimiteCarta; j++){

                    cartas[(i * (Card.LimiteCarta) + j)] = new Card(j + 1, palos[i]);
            }
        }


    }










        /*Card ca = new Card();
        ca.carta();

        ArrayList<Object> mazo = new ArrayList<>();

        for (int c = 0; c <= 52; c++) {
            mazo.add(c);
        }
        //System.out.println("original" + mazo);

        List<Object> shuffleMe =new ArrayList<Object>(mazo);
        Collections.shuffle(shuffleMe);
        Set<Object> shuffledSet = new LinkedHashSet<Object>();
        shuffledSet.addAll(shuffleMe);
        //System.out.println("revuelto" + shuffledSet);*/

    }
