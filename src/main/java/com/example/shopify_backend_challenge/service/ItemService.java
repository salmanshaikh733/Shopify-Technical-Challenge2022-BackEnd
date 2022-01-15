package com.example.shopify_backend_challenge.service;

import com.example.shopify_backend_challenge.model.Item;

import java.util.List;

public interface ItemService {

    public List<Item> getAllItems();

    public void addNewItem(Item item);

    public Item getItem(Long id);

    public boolean checkIfItemExists(Long id);

    public Item updateItem(Long id, Item newItemInfo);

    public void deleteItem(Item itemId);

    public Item changeItemQuantity(Long id, int quantity);

}
