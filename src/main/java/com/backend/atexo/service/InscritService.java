package com.backend.atexo.service;

import com.backend.atexo.model.CriteresNumerotation;
import com.backend.atexo.model.Inscrit;
import com.backend.atexo.model.NumeroElement;
import com.backend.atexo.model.Critere;
import com.backend.atexo.repository.InscritRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InscritService {
    @Autowired
    private InscritRepository inscritRepository;

    public String genererNumero(Inscrit inscrit, CriteresNumerotation criteres) {
        List<NumeroElement> elements = new ArrayList<>();

        elements.add(creerNumeroElement(inscrit.getPrenom(), criteres.getPrenomCritere()));
        elements.add(creerNumeroElement(inscrit.getNom(), criteres.getNomCritere()));
        elements.add(creerNumeroElement(inscrit.getDateNaissance().replace("-", ""), criteres.getDateCritere()));
        elements.add(creerNumeroElement(String.valueOf(inscrit.getCompteur() + criteres.getCompteurCritere().getLongueur()), criteres.getCompteurCritere()));

        // Tri des éléments selon l'ordre
        return elements.stream()
                .sorted(Comparator.comparingInt(NumeroElement::getOrdre))
                .map(NumeroElement::getValeur)
                .collect(Collectors.joining());
    }

    private NumeroElement creerNumeroElement(String valeur, Critere critere) {
        if (critere.getLongueur() > 0 && valeur.length() > critere.getLongueur()) {
            valeur = valeur.substring(0, critere.getLongueur());
        }
        if (critere.getSuffixe() != null) {
            valeur += critere.getSuffixe();
        }
        if (critere.getPrefixe() != null) {
            valeur = critere.getPrefixe() + valeur;
        }
        return new NumeroElement(valeur, critere.getOrdre());
    }
}