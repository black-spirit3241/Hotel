package com.example.hotelbooking.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotelbooking.R;
import com.example.hotelbooking.adapters.HomeFragmentItemAdapter;
import com.example.hotelbooking.adapters.ViewPagerAdapter;

public class FragmentHome extends Fragment {
//    RecyclerView homeRecyclerView;
//    HomeFragmentItemAdapter adapter;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_home_layout,container,false);
        return inflater.inflate(R.layout.home_layout,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        homeRecyclerView=view.findViewById(R.id.homeFragmentRecyclerView);
//        LinearLayoutManager manager=new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
//        adapter=new HomeFragmentItemAdapter();
//        homeRecyclerView.setLayoutManager(manager);
//        homeRecyclerView.setAdapter(adapter);

        tabLayout=view.findViewById(R.id.tabLayout);
        viewPager=view.findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapter(getActivity().getSupportFragmentManager());
        setupViewPager();
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    public void setupViewPager(){
        viewPagerAdapter.addFragment(new HomeItemFragment(),getResources().getString(R.string.tab_nearby));
        viewPagerAdapter.addFragment(new HomeItemFragment(),getResources().getString(R.string.tab_popular));
        viewPagerAdapter.addFragment(new HomeItemFragment(),getResources().getString(R.string.tab_all));
    }
}
