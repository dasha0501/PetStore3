package com.example.petstore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;

public class Photo {
    @SerializedName("photo_Urls")
    @Expose
    private Array photoUrls;
    public Array getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(Array photoUrls) {
        this.photoUrls = photoUrls;
    }
}
