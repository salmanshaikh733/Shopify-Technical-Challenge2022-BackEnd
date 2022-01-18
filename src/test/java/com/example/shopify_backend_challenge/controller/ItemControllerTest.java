package com.example.shopify_backend_challenge.controller;

import com.example.shopify_backend_challenge.repository.ItemRepository;
import com.example.shopify_backend_challenge.service.ItemServiceImplementation;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.mock.mockito.MockBean;

class ItemControllerTest {

    @MockBean
    private ItemRepository itemRepository;

    @InjectMocks
    private ItemServiceImplementation itemService;

    @Test
    void getAllItems() {


    }

    @Test
    void addNewItem() {
    }

    @Test
    void getItem() {
    }

    @Test
    void updateItem() {
    }

    @Test
    void deleteItem() {
    }

    @Test
    void changeQuantity() {
    }
}