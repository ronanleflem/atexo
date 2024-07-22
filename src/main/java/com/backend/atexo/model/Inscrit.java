package com.backend.atexo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
public class Inscrit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Le nom ne peut pas être nul")
    @Size(min = 1, message = "Le nom doit avoir au moins 1 caractère")
    private String nom;

    @NotNull(message = "Le prenom ne peut pas être nul")
    @Size(min = 1, message = "Le prenom doit avoir au moins 1 caractère")
    private String prenom;

    @NotNull(message = "La date de naissance ne peut pas être nulle")
    private String dateNaissance;

    @NotNull(message = "Le compteur ne peut pas être nul")
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
