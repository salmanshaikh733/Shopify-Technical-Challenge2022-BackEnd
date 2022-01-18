package com.example.shopify_backend_challenge.service;

import com.example.shopify_backend_challenge.helperMethods.CSVHelper;
import com.example.shopify_backend_challenge.model.Item;
import com.example.shopify_backend_challenge.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.List;

@Service
public class CSVService {


    @Autowired
    ItemRepository repository;

    public ByteArrayInputStream loadCsv() {
        List<Item> shopItems = repository.findAll();

        return CSVHelper.generateCSV(shopItems);
    }


}
