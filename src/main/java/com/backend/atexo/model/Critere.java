package com.backend.atexo.model;

import lombok.Getter;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class Critere {
    private int longueur;
    private String suffixe;
    private int ordre;
    private String prefixe;

    @Override
    public String toString() {
        return "Critere{" +
                "longueur=" + longueur +
                ", suffixe='" + suffixe + '\'' +
                ", ordre=" + ordre +
                ", prefixe='" + prefixe + '\'' +
                '}';
    }

}
