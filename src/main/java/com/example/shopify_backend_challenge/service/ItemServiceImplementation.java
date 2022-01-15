package com.example.shopify_backend_challenge.service;

import com.example.shopify_backend_challenge.exception.ResourceNotFoundException;
import com.example.shopify_backend_challenge.model.Item;
import com.example.shopify_backend_challenge.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImplementation implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public void addNewItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public Item getItem(Long id) {
        Item item = itemRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Item Does not exist with id:" + id));
        return item;
    }

    @Override
    public boolean checkIfItemExists(Long id) {
        return itemRepository.existsById(id);
    }

    @Override
    public Item updateItem(Long id, Item newItemInfo) {
        Item item = getItem(id);

        item.setItemName(newItemInfo.getItemName());
        item.setPrice(newItemInfo.getPrice());
        item.setQuantity(newItemInfo.getQuantity());

        Item updatedItem = itemRepository.save(item);

        return updatedItem;
    }

    @Override
    public void deleteItem(Item itemId) {
        itemRepository.delete(itemId);
    }

    @Override
    public Item changeItemQuantity(Long id, int quantity) {
        Item item = getItem(id);
        item.setQuantity(quantity);

        Item updatedItem = itemRepository.save(item);

        return updatedItem;
    }

}
