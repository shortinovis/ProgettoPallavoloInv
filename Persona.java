package com.example.progettopallavoloinfo;

import java.util.Objects;

public class Persona {
    private String nomeEcognome;
    private  int eta;

    public Persona(String nomeEcognome, int eta){
        this.nomeEcognome=nomeEcognome;
        this.eta=eta;
    }

    public String getNomeEcognome() {
        return nomeEcognome;
    }

    public void setNomeEcognome(String nomeEcognome) {
        this.nomeEcognome = nomeEcognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Persona{" + "nomeEcognome='" + nomeEcognome + '\'' + ", eta=" + eta + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return eta == persona.eta && Objects.equals(nomeEcognome, persona.nomeEcognome);
    }
}
