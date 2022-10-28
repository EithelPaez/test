package com.example.testeithel1.service;

import com.example.testeithel1.repository.ItemRepository;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;

public class SearchService {
    private final ItemRepository itemRepository;

    /**
     * Searches for the item Matching the name that is sent by the user
     * @param itemName
     * @return Items matching the requirements
     */
    public List<Item> find(String itemName) { return findItem(itemName); }

    private List<Item> findItem(String itemName) {
        return itemRepository.findAllByName(itemName);;
    }
}
