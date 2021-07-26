package com.example.SimulatorCredit.repository;

import com.example.SimulatorCredit.models.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientRepository extends CrudRepository<Client,Long> {
}
