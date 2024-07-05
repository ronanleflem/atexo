package com.backend.atexo.dto;

import com.backend.atexo.model.CriteresNumerotation;
import com.backend.atexo.model.Inscrit;
import lombok.Getter;

@Getter
public class InscritRequest {
    private Inscrit inscrit;
    private CriteresNumerotation criteres;

    @Override
    public String toString() {
        return "InscritRequest{" +
                "inscrit=" + inscrit +
                ", criteres=" + criteres +
                '}';
    }
}
