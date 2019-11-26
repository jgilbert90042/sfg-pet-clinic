package com.gilbertcon.sfgpetclinic.services;

import com.gilbertcon.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
