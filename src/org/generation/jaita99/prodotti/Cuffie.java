package org.generation.jaita99.prodotti;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean wireless;

    public Cuffie(int codice, String nome, String descrizione, BigDecimal prezzo, BigDecimal vat,String colore,boolean wireless) {
        super(codice, nome, descrizione, prezzo, vat);
        this.colore=colore;
        this.wireless=wireless;
    }

    @Override
    public String toString() {
        return "Cuffie{" +
                "colore='" + colore + '\'' +
                ", wireless=" + wireless +
                '}';
    }
}
