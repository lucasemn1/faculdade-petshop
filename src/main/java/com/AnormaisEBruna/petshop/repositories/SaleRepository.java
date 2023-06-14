package com.AnormaisEBruna.petshop.repositories;

import com.AnormaisEBruna.petshop.models.SaleModel;
import org.springframework.data.repository.CrudRepository;

public interface SaleRepository  extends CrudRepository<SaleModel, Integer> {
}
