package com.gilbertcon.sfgpetclinic.repositories;

import com.gilbertcon.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
