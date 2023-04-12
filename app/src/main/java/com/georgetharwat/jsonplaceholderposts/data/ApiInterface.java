package com.georgetharwat.jsonplaceholderposts.data;

import com.georgetharwat.jsonplaceholderposts.pojo.PostsModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("posts")
    public Call<List<PostsModel>> getPosts();
}
