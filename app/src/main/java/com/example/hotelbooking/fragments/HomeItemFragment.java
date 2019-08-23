package com.example.hotelbooking.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotelbooking.R;
import com.example.hotelbooking.adapters.HomeFragmentItemAdapter;

public class HomeItemFragment extends Fragment {
    RecyclerView homeRecyclerView;
    HomeFragmentItemAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home_layout,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        homeRecyclerView=view.findViewById(R.id.homeFragmentRecyclerView);
        LinearLayoutManager manager=new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        adapter=new HomeFragmentItemAdapter();
        homeRecyclerView.setLayoutManager(manager);
        homeRecyclerView.setAdapter(adapter);
    }
}
