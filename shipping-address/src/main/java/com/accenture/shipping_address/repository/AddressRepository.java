package com.accenture.shipping_address.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.accenture.shipping_address.entity.AddressEntity;
@Repository
public interface AddressRepository extends CrudRepository<AddressEntity,Long>{

}
