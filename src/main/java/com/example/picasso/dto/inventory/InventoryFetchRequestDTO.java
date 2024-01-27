package com.example.picasso.dto.inventory;
import com.example.picasso.model.inventory.Filter;
import lombok.AllArgsConstructor;

import java.util.List;
//import java.util.logging.Filter;


@AllArgsConstructor

public class InventoryFetchRequestDTO {
    String search;
    List<Filter> filters;
    int pageSize;
    String sort;
    String sortKey;
    int page;

    public String getSearch() {
        return search;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public int getPageSize() {
        return pageSize;
    }

    public String getSort() {
        return sort;
    }

    public String getSortKey() {
        return sortKey;
    }

    public int getPage() {
        return page;
    }
}
