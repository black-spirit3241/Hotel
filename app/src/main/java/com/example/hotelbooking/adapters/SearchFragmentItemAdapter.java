package com.example.hotelbooking.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotelbooking.R;
import com.example.hotelbooking.holder.views.SearchFragmentViewHolder;

public class SearchFragmentItemAdapter extends RecyclerView.Adapter<SearchFragmentViewHolder> {
    @NonNull
    @Override
    public SearchFragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_fragment_recycler_item_layout,viewGroup,false);
        return new SearchFragmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchFragmentViewHolder searchFragmentViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
