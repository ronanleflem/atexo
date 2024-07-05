package com.backend.atexo.model;

import lombok.Getter;

@Getter
public class NumeroElement {
    private String valeur;
    private int ordre;

    public NumeroElement(String valeur, int ordre) {
        this.valeur = valeur;
        this.ordre = ordre;
    }

}
