package com.AnormaisEBruna.petshop.services;

import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.SaleModel;
import com.AnormaisEBruna.petshop.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class SaleService {
    @Autowired
    SaleRepository saleRepository;

    public void save(SaleModel sale) throws SQLException {
        try {
            this.saleRepository.save(sale);
        } catch (Exception error) {
            throw new SQLException("Não foi possível salvar a venda.");
        }
    }

    public ArrayList<SaleModel> findAll() throws SQLException {
        try {
            Iterable<SaleModel> seleResponses = this.saleRepository.findAll();
            ArrayList<SaleModel> sales = new ArrayList();

            for (SaleModel sale : seleResponses) {
                sales.add(sale);
            }

            return sales;
        } catch (Exception error) {
            throw new SQLException("Não foi possível buscar as vendas.");
        }
    }
}



