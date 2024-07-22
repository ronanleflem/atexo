package com.backend.atexo.model;

import lombok.Getter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
public class CriteresNumerotation {
    @Valid
    @NotNull(message = "Le critère prénom ne peut pas être nul")
    private Critere prenomCritere;

    @Valid
    @NotNull(message = "Le critère nom ne peut pas être nul")
    private Critere nomCritere;

    @Valid
    @NotNull(message = "Le critère date ne peut pas être nul")
    private Critere dateCritere;

    @Valid
    @NotNull(message = "Le critère compteur ne peut pas être nul")
    private Critere compteurCritere;
}
