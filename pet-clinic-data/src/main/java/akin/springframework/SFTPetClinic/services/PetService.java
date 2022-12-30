package akin.springframework.SFTPetClinic.services;

import akin.springframework.SFTPetClinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
