package com.example.testeithel1.controller;

import com.example.testeithel1.service.SearchService;
import com.sun.istack.internal.NotNull;

@RestController
@RequestMapping("/v1")
@Slf4j
public class AvailabilityController implements FindAvailabilityAPI {
    private final SearchService searchService;
    /**
     * Finds an especific Item and tells us about its availability
     *
     * @param itemName Name of the specific Item to be searched.
     *                 This parameter is Required
     */
    @Override
    public ResponseEntity<ItemResponse> findItem(@NotNull String itemName) {
       return searchService.findItem(itemName);
    }

}
