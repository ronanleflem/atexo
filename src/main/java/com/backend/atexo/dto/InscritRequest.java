package com.backend.atexo.dto;

import com.backend.atexo.model.CriteresNumerotation;
import com.backend.atexo.model.Inscrit;
import lombok.Getter;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@Getter
public class InscritRequest {

    @NotNull(message = "L'inscrit ne peut pas être nulle")
    @Valid
    private Inscrit inscrit;

    @NotNull(message = "Les critères ne peuvent pas être nuls")
    @Valid
    private CriteresNumerotation criteres;

    @Override
    public String toString() {
        return "InscritRequest{" +
                "inscrit=" + inscrit +
                ", criteres=" + criteres +
                '}';
    }
}
