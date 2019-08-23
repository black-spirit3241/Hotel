package com.example.hotelbooking;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.hotelbooking.adapters.ViewPagerAdapter;
import com.example.hotelbooking.fragments.FragmentHome;
import com.example.hotelbooking.fragments.FragmentSearch;

public class MainActivity extends AppCompatActivity {
//    TabLayout tabLayout;
//    ViewPager viewPager;
//    ViewPagerAdapter viewPagerAdapter;

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tabLayout=findViewById(R.id.tabLayout);
//        viewPager=findViewById(R.id.viewPager);
        bottomNavigationView=findViewById(R.id.bottom_navigation);

//        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
//        setupViewPager();
//        viewPager.setAdapter(viewPagerAdapter);
//
//        tabLayout.setupWithViewPager(viewPager);

        //Default Fragment
        FragmentManager fm=getSupportFragmentManager();
        fm.beginTransaction().add(R.id.fragmentContainer,new FragmentHome()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.action_home:
                        changeHomeFragment();
                        return true;
                    case R.id.action_search:
                        changeSearchFragment();
                        return true;
                    case R.id.action_note:
//                        viewPager.setCurrentItem(2);
                        return true;
                    case R.id.action_bookmark:
//                        viewPager.setCurrentItem(2);
                        return true;
                }
                return false;
            }
        });

    }

//    public void setupViewPager(){
//        viewPagerAdapter.addFragment(new FragmentHome(),getResources().getString(R.string.tab_nearby));
//        viewPagerAdapter.addFragment(new FragmentSearch(),getResources().getString(R.string.tab_popular));
//        viewPagerAdapter.addFragment(new FragmentHome(),getResources().getString(R.string.tab_all));
//    }

    public void changeHomeFragment(){
        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer,new FragmentHome()).commit();
    }

    public void changeSearchFragment(){
        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer,new FragmentSearch()).commit();
    }
}
