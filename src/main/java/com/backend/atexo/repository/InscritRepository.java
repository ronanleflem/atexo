package com.backend.atexo.repository;

import com.backend.atexo.model.Inscrit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InscritRepository extends JpaRepository<Inscrit, Long> {
}
