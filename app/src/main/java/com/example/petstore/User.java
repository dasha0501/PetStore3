package com.example.petstore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class User {
    @Expose
    private String name;
    @Expose
    private String status;
    @Expose
    private Integer id;
    @Expose
    private ArrayList photoUrls;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public ArrayList getPhotoUrls() { return photoUrls; }
    public void setPhotoUrls(ArrayList value) { this.photoUrls = value; }


}