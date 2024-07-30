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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;

import com.backend.atexo.exception.ValidationException;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/inscrits")
public class InscritController {
    Logger logger = LoggerFactory.getLogger(InscritController.class);

    @Autowired
    private InscritService inscritService;

    @PostMapping
    public ResponseEntity<String> creerInscrit(@Valid @RequestBody InscritRequest inscritRequest, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            logger.info("Binding error has occured !");
            Map<String, String> errors = new HashMap<>();
            bindingResult.getFieldErrors().forEach(error ->
                    errors.put(error.getField(), error.getDefaultMessage()));
            throw new ValidationException(errors);
        }
        logger.info("HTTP REQUEST OK !");
        return new ResponseEntity<>(inscritService.genererNumero(inscritRequest.getInscrit(), inscritRequest.getCriteres()), HttpStatus.OK);
    }

}