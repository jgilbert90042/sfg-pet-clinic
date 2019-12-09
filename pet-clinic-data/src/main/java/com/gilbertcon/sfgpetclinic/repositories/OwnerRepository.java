package com.gilbertcon.sfgpetclinic.repositories;

import com.gilbertcon.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
