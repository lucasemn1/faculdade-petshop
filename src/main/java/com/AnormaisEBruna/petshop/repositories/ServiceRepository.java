package com.AnormaisEBruna.petshop.repositories;
import com.AnormaisEBruna.petshop.models.ServiceType;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<ServiceType, Integer> {
}