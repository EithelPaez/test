package com.example.testeithel1.repository;
import javax.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public interface ItemRepository {
    String ITEM_QUERY =
            " SELECT e.itemName \n" +
                    "FROM {h-schema}item_entry e";
    default List<Item> findAllByName(String itemName) {
        var query = getEntityManager.createNativeQuery(ITEM_QUERY);
        List<Object[]> results = query.getResultList();
        if (results.isEmpty()) {
            return Collections.emptyList();;
        }
        else {
            return results.stream().map(ItemEntry::newInstance).collect(Collectors.toList());
        }
    }
}
