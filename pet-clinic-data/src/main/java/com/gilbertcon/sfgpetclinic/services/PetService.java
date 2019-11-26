package com.gilbertcon.sfgpetclinic.services;

import com.gilbertcon.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
