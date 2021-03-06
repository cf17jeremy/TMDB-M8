package com.example.fragments.Config;

import com.example.fragments.Model.Film.FavFilmResponse;
import com.example.fragments.Model.Film.searchFilmModel;
import com.example.fragments.Model.Film.FavFilmRequest;
import com.example.fragments.Model.List.ListModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiCall {

    @GET("search/movie?")
    Call<searchFilmModel> getData(@Query("api_key") String api_key, @Query("query") String query);

    @GET("account/{account_id}/favorite/movies?")
    Call<FavFilmRequest> getData(@Query("api_key") String api_key, @Query("session_id") String session_id, @Query("query") String query);

    @POST("account/{account_id}/favorite?")
    Call<FavFilmResponse> postData(@Query("api_key") String api_key, @Query("session_id") String session_id);

    @POST("list?")
    Call<ListModel> postList(@Query("api_key") String api_key, @Query("query") String session_id, @Body List list);

}
