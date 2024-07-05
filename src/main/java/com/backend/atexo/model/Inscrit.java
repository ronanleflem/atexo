package com.backend.atexo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Inscrit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private Long compteur;
    private String resultatGeneration;

    public void setResultatGeneration(String resultatGeneration) {
        this.resultatGeneration = resultatGeneration;
    }
    @Override
    public String toString() {
        return "Inscrit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", compteur=" + compteur +
                '}';
    }
}
