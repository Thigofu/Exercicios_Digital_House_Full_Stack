package com.zaleski;

public class Main {
    public static void main(String[] args) {
        Pato pato = new Pato();
        Aviao aviao = new Aviao();
        SuperHomem superman = new SuperHomem();
        Voador[] voadores = {pato, aviao, superman};
        TorreDeControle torrecontrole = new TorreDeControle(voadores);

        torrecontrole.voemTodos();
        System.out.println("\n");
        torrecontrole.voemTodos();
        System.out.println("\n");
        torrecontrole.voemTodos();
        System.out.println("\n");
        torrecontrole.voemTodos();
        System.out.println("\n");
        torrecontrole.voemTodos();
        System.out.println("\n");
        torrecontrole.voemTodos();
        System.out.println("\n");

    }
}
