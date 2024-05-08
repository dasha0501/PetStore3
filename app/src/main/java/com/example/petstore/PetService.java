package com.example.petstore;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface PetService {
    // GET /users/:username

    @GET("/v2/pet/{id}")

    Call<User> getId(
            @Path("id") int id
    );


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://petstore.swagger.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}

