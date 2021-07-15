package com.example.retrofit_i;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("/api/users/{userId}")
    Call<ResponseDTO> getUser(@Path("userId") int userId);
}
