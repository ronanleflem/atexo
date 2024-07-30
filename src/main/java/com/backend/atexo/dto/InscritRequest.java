package com.backend.atexo.dto;

import com.backend.atexo.model.CriteresNumerotation;
import com.backend.atexo.model.Inscrit;
import lombok.Getter;


import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter
public class InscritRequest {

    @NotNull(message = "L'inscrit ne peut pas être nulle")
    @Valid
    @NotBlank
    private Inscrit inscrit;

    @NotNull(message = "Les critères ne peuvent pas être nuls")
    @Valid
    @NotBlank
    private CriteresNumerotation criteres;

    @NotNull
    @Valid
    @Size(min = 4, max = 15)
    private String password = null;

    @Override
    public String toString() {
        return "InscritRequest{" +
                "inscrit=" + inscrit +
                ", criteres=" + criteres +
                '}';
    }
}
