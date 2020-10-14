package com.tecmilenio;


//Este metodo es para definir el objeto carta

public class Card {

    private String valor;
    private String palo;
    private String color;


    Card(String palo, String color, String valor) {
        this.valor = valor;
        this.palo = palo;
        this.color = color;
    }

    public Card(String palo, String color) {
        this.palo = palo;
        this.color = color;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setValor(Integer valor) {
        if (valor <= 10) {
            if (valor == 1) this.valor = "A";
            this.valor = valor.toString();
        } else {
            if (valor == 11) this.valor = "J";
            else if (valor == 12) this.valor = "Q";
            else this.valor = "K";
        }
    }


    @Override
    public String toString() {
        String mensaje = "%s, %s, %s";
        //return "valor=" + valor + ", palo=" + palo + "color=" + color;
        return String.format(mensaje, palo, color, valor);
    }

}

    /*ArrayList<Object> palo= new ArrayList<>();


        palo.add ("trebol");
        palo.add ("corazon");
        palo.add ("pica");
        palo.add ("diamante");


        ArrayList<Object> color= new ArrayList<>();

        color.add ("negro");
        color.add ("rojo");


        ArrayList<Object> valor= new ArrayList<>();
        valor.add ("A");
        valor.add ("2");
        valor.add ("3");
        valor.add ("4");
        valor.add ("5");
        valor.add ("6");
        valor.add ("7");
        valor.add ("8");
        valor.add ("9");
        valor.add ("10");
        valor.add ("K");
        valor.add ("Q");
        valor.add ("J");*/



