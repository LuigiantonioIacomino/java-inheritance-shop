package org.generation.jaita99.prodotti;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private int IMEIcode;
    private int memory;

    public Smartphone(int codice, String nome, String descrizione, BigDecimal prezzo, BigDecimal vat,int IMEIcode,int memory) {
        super(codice, nome, descrizione, prezzo, vat);
        this.IMEIcode=IMEIcode;
        this.memory=memory;
    }
}
