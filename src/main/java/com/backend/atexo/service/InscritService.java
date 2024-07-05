package com.backend.atexo.service;

import com.backend.atexo.model.Inscrit;
import com.backend.atexo.repository.InscritRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscritService {
    @Autowired
    private InscritRepository inscritRepository;

    public String genererNumero(Inscrit inscrit) {
        // Create num
        String numero = "";

        // Save on database
        inscritRepository.save(inscrit);

        return numero;
    }
}