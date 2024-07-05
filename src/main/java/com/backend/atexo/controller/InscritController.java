package com.backend.atexo.controller;

import com.backend.atexo.dto.InscritRequest;
import com.backend.atexo.model.CriteresNumerotation;
import com.backend.atexo.model.Inscrit;
import com.backend.atexo.service.InscritService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inscrits")
public class InscritController {
    Logger logger = LoggerFactory.getLogger(InscritController.class);

    @Autowired
    private InscritService inscritService;

    @PostMapping
    public ResponseEntity<String> creerInscrit(@RequestBody InscritRequest inscritRequest) {
        logger.info(inscritRequest.toString());
        return new ResponseEntity<>(inscritService.genererNumero(inscritRequest.getInscrit(), inscritRequest.getCriteres()), HttpStatus.OK);
    }
}