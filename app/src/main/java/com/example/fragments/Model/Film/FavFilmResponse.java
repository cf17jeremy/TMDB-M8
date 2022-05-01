package com.example.fragments.Model.Film;

import java.util.ArrayList;

public class FavFilmResponse {
    public int page;
    public ArrayList<Film> results;

    public int getPage() {
        return page;
    }

    public ArrayList<Film> getResults() {
        return results;
    }
}
