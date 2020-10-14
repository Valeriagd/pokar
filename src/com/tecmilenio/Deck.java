package com.tecmilenio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;


//En este metodo se creo el objeto Deck que es el mazo con todas las cartas

public class Deck {

    //Inicializar las variables

    private HashMap<String,String> palos = new HashMap <String, String>();
    private ArrayList <Card> baraja = new ArrayList<Card>();
    private String strFormat = "Quedan %s";

    //llamar clase card

    public ArrayList<Card> getBaraja(){
        return baraja;
    }

    //Definir los palos con su color fijo

    public void mazo(){
        palos.put("Diamante", "Rojo");
        palos.put("Trebol","Negro");
        palos.put("Pica","Negro");
        palos.put("Corazon","Rojo");
    }

    //Creamos la baraja con todos los tipos de carta sin repetirse

    public void crearBaraja(){
        mazo();
        for(Map.Entry<String,String> palo:palos.entrySet()){
            var paloCard = palo.getKey();
            var color = palo.getValue();

            for(int i=1; i <= 13; i++){
                    Card card = new Card(paloCard, color);
                    card.setValor(i);
                    baraja.add(card);
            }
        }


    }

    //Dar orden aleatorio a las cartas

    public void descomponer() {
        Collections.shuffle(baraja);
        System.out.println("se mezclo el Deck");
    }

    //Mostrar la primera carta

    public void head(){
        var card = baraja.get(baraja.size()-1);
        baraja.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(strFormat,baraja.size()));
    }

    //Sacar una carta random

    private Card randomCard(){
        var rnd = (int)Math.floor(Math.random()*(1-baraja.size()+1)+baraja.size());
        return baraja.get(rnd);
    }


    public void pick(){
        var card = randomCard();
        baraja.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(strFormat,baraja.size()));
    }

    private void printHand(ArrayList<Card> cards){
        for (var card: cards) System.out.println(card.toString());
    }

    //Mostrar la mano de 5 cartas y eliminarlas del mazo

    public void hand(){
        if(baraja.size() <= 5){
            for (var card:baraja){
                printHand(baraja);
            }
        }else{
            var cards = new ArrayList<Card>();
            Card card;
            for (int i=1; i<=5;i++){
                card = randomCard();
                baraja.remove(card);
                cards.add(card);
            }
            printHand(cards);
            System.out.println(String.format(strFormat,baraja.size()));
        }
    }

}
