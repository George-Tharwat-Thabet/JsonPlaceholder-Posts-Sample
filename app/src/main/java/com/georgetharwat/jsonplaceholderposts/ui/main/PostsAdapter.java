package com.georgetharwat.jsonplaceholderposts.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.georgetharwat.jsonplaceholderposts.R;
import com.georgetharwat.jsonplaceholderposts.pojo.PostsModel;

import java.util.ArrayList;
import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostsViewHolder> {

    private ArrayList<PostsModel> list = new ArrayList<>();

    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the item layout for the RecyclerView
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.posts_item, parent, false);
        return new PostsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostsViewHolder holder, int position) {
        holder.title_tv.setText(list.get(position).getTitle());
        holder.body_tv.setText(list.get(position).getBody());
        holder.userId_tv.setText(list.get(position).getUserId() + "");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // Define the ViewHolder class
    public class PostsViewHolder extends RecyclerView.ViewHolder {

        TextView title_tv, body_tv, userId_tv;

        public PostsViewHolder(@NonNull View itemView) {
            super(itemView);

            // Initialize TextView references
            title_tv = itemView.findViewById(R.id.title_tv);
            body_tv = itemView.findViewById(R.id.body_tv);
            userId_tv = itemView.findViewById(R.id.userId_tv);
        }
    }

    // Method to set the posts data in the adapter
    public void setList(List<PostsModel> postsModels) {
        this.list = (ArrayList<PostsModel>) postsModels;
        notifyDataSetChanged(); // Notify the adapter of data changes
    }
}