package com.example.petstore;

import retrofit2.Call;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface PhotoUrls {
    // GET /users/:username


    @GET("/v2/pet/{photoUrls}")

    Call<Photo> getPhotoUrls(
            @Path("photoUrls") String photoUrls
    );

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://petstore.swagger.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
