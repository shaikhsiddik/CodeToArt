package com.example.siddik.codeart.network;



import com.example.siddik.codeart.models.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface ApiEndpointInterface {

    @GET("movie/now_playing")
    Call<MoviesResponse> getNowPayingMovies(@Query("api_key") String apiKey, @Query("page") int page);
}
