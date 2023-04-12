package com.georgetharwat.jsonplaceholderposts.data;

import com.georgetharwat.jsonplaceholderposts.pojo.PostsModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostsClient {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private ApiInterface apiInterface;
    private static PostsClient INSTANCE;

    public PostsClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiInterface = retrofit.create(ApiInterface.class);
    }

    public static PostsClient getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new PostsClient();
        }
        return INSTANCE;
    }

    public Call<List<PostsModel>> getPosts() {
        return apiInterface.getPosts();
    }
}