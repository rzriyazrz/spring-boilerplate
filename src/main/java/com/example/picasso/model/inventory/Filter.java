package com.example.picasso.model.inventory;

import lombok.AllArgsConstructor;

import java.util.List;
@AllArgsConstructor
public class Filter {
    String key;
    int type;
    List<String> values;

    public String getKey() {
        return key;
    }

    public int getType() {
        return type;
    }

    public List<String> getValues() {
        return values;
    }
}

