package com.AnormaisEBruna.petshop.repositories;
import com.AnormaisEBruna.petshop.models.ServiceTypeModel;
import org.springframework.data.repository.CrudRepository;

public interface ServiceTypeRepository extends CrudRepository<ServiceTypeModel, Integer> {
}