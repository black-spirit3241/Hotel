package com.example.hotelbooking.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotelbooking.R;
import com.example.hotelbooking.holder.views.HomeFragmentViewItemHolder;

public class HomeFragmentItemAdapter extends RecyclerView.Adapter<HomeFragmentViewItemHolder> {

    @NonNull
    @Override
    public HomeFragmentViewItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_fragment_recycler_item_layout,viewGroup,false);
        return new HomeFragmentViewItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeFragmentViewItemHolder homeFragmentViewItemHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
