package com.example.progettopallavoloinfo;

import java.util.ArrayList;

public class Squadra {
    private ArrayList<Persona> lista;
    private int indice=0;
    public Squadra(){
        this.lista = new ArrayList<>();
    }
    public  void aggiuntaGiocatore(String nomeEcognome, int eta, String ruolo, boolean capitano){
        lista.add(new Giocatore(nomeEcognome,eta,ruolo,capitano));
        indice++;
    }
}
