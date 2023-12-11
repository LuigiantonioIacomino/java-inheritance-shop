package org.generation.jaita99.prodotti;

import java.math.BigDecimal;

public class Televisori extends Prodotto {
    private int size;
    private boolean smart;

    public Televisori(int codice, String nome, String descrizione, BigDecimal prezzo, BigDecimal vat,int size,boolean smart) {
        super(codice, nome, descrizione, prezzo, vat);
        this.size=size;
        this.smart=smart;
    }

    @Override
    public String toString() {
        return "Televisori{" +
                "size=" + size +
                ", smart=" + smart +
                '}';
    }
}
