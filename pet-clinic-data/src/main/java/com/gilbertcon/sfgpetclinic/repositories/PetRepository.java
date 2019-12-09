package com.gilbertcon.sfgpetclinic.repositories;

import com.gilbertcon.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
