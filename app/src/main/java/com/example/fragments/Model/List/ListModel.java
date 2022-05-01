package com.example.fragments.Model.List;

import java.util.ArrayList;

public class ListModel {
    public String name, description, language;

    public ListModel(String name, String description, String language) {
        this.name = name;
        this.description = description;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }
}
