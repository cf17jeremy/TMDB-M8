package com.example.fragments.Config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DefaultConstants {

    public static final String API_KEY = "218a826e2f2adf101fce268a0f368dfa";
    public static final String SESSION_ID = "d5b00193fad0c12ce51ff61af7ef939be3be5023";
    public static final String ACCOUNT_ID = "cf17jeremy";

    public static final String BASE_IMG_URL = "https://image.tmdb.org/t/p/w500/";

    public static final Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl("https://api.themoviedb.org/3/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();

}
