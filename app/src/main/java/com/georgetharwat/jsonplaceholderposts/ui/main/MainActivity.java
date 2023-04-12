package com.georgetharwat.jsonplaceholderposts.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.georgetharwat.jsonplaceholderposts.R;
import com.georgetharwat.jsonplaceholderposts.pojo.PostsModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    PostsViewModel postsViewModel;
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        postsViewModel = ViewModelProviders.of(this).get(PostsViewModel.class);
        postsViewModel.getPosts();

        recyclerview = findViewById(R.id.recyclerview);
        final PostsAdapter postsAdapter = new PostsAdapter();

        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(postsAdapter);

        postsViewModel.postsMutableLiveData.observe(this, new Observer<List<PostsModel>>() {
            @Override
            public void onChanged(List<PostsModel> postsModels) {
                postsAdapter.setList(postsModels);
            }
        });
    }
}