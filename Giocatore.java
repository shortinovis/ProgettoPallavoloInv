package com.example.progettopallavoloinfo;

import java.util.Objects;

public class Giocatore extends Persona{
    private String ruolo;
    private boolean capitano;

    public Giocatore(String nomeEcognome, int eta, String ruolo, boolean capitano){
        super(nomeEcognome, eta);
        this.ruolo=ruolo;
        this.capitano=capitano;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public boolean getCapitano() {
        return capitano;
    }

    public void setCapitano(boolean capitano) {
        this.capitano = capitano;
    }

    @Override
    public String toString() {
        return super.toString() + "Giocatore{" + "ruolo='" + ruolo + '\'' + ", capitano=" + capitano + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Giocatore giocatore = (Giocatore) o;
        return capitano == giocatore.capitano && Objects.equals(ruolo, giocatore.ruolo);
    }

}
