package com.saggese;

import java.util.*;

public class Root {

    private int annoDiInizio;
    private Aula aula = new Aula();
    private String classe;
    private int numeroFinestre;
    private String specializzazione;
    private ArrayList<Element> studenti;

    public int getAnnoDiInizio() {
        return this.annoDiInizio;
    }

    public void setAnnoDiInizio(int annoDiInizio) {
        this.annoDiInizio = annoDiInizio;
    }

    public Aula getAula() {
        return this.aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public String getClasse() {
        return this.classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNumeroFinestre() {
        return this.numeroFinestre;
    }

    public void setNumeroFinestre(int numeroFinestre) {
        this.numeroFinestre = numeroFinestre;
    }

    public String getSpecializzazione() {
        return this.specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public ArrayList<Element> getStudenti() {
        return this.studenti;
    }

    public void setStudenti(ArrayList<Element> studenti) {
        this.studenti = studenti;
    }

}
