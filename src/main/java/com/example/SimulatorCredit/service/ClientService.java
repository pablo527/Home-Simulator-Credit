package com.example.SimulatorCredit.service;

import com.example.SimulatorCredit.models.Client;
import com.example.SimulatorCredit.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IClientService{
    @Autowired
    IClientRepository repository;

    @Override
    public Client registerClient(Client client) {
        return repository.save(client);
    }
}
