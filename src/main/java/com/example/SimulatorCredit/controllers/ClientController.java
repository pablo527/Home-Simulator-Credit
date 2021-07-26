package com.example.SimulatorCredit.controllers;

import com.example.SimulatorCredit.models.Client;
import com.example.SimulatorCredit.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;


@RestController
public class ClientController {

    @Autowired
    ClientService service;

    @PostMapping(value="/registerClient")
    public ResponseEntity registerClient (@Valid @RequestBody Client client){
        client = service.registerClient(client);
        return new ResponseEntity<>(client, HttpStatus.CREATED);
    }

    
}
