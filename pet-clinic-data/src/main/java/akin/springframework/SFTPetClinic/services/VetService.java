package akin.springframework.SFTPetClinic.services;


import akin.springframework.SFTPetClinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
