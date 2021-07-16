package com.example.getlistofalbums;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("/albums")
    Call<List<ResponseModel>> getPost();

}