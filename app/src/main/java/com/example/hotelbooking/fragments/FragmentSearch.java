package com.example.hotelbooking.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotelbooking.R;
import com.example.hotelbooking.adapters.SearchFragmentItemAdapter;

public class FragmentSearch extends Fragment {
    MaterialButton btnFilter;
    RecyclerView searchRecyclerView;
    SearchFragmentItemAdapter searchFragmentItemAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.search_layout,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        searchRecyclerView=view.findViewById(R.id.searchRecyclerView);
        searchFragmentItemAdapter=new SearchFragmentItemAdapter();
        LinearLayoutManager manager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        searchRecyclerView.setLayoutManager(manager);
        searchRecyclerView.setAdapter(searchFragmentItemAdapter);

        btnFilter=view.findViewById(R.id.btnFilter);
        btnFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                View view=getLayoutInflater().inflate(R.layout.bottom_sheet_layout,null);
//                BottomSheetDialog dialog=new BottomSheetDialog(getActivity());
//                dialog.setContentView(view);
//                dialog.show();

                BottomSheetDialogFragment fragment=new BottomSheetFragment();
                fragment.show(getFragmentManager(),fragment.getTag());
            }
        });
    }
}
