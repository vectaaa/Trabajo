package com.trabajo.trabajo.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gadspracticeproject.R;
import com.gadspracticeproject.Trabajo.Adapters.HomeRecyclerAdapter;
import com.gadspracticeproject.Trabajo.Models.HomeJobsModel;

import java.util.ArrayList;


public class JobsFragment extends Fragment {

    ArrayList<HomeJobsModel> homeJobsModels;
    RecyclerView recyclerView;
    HomeRecyclerAdapter adapter;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_jobs, container, false);


        //Implementing recyclerview;
        recyclerView = view.findViewById(R.id.jobs_recycler_view);
//        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new HomeRecyclerAdapter(getContext());

        homeJobsModels = new ArrayList<>();

        // getting network Requests
        getPosts();

        return view;


    }

        private void getPosts() {
        HomeJobsModel one = new HomeJobsModel();
        one.setCompanyName("Microsoft Inc");
        one.setJobDetails("Working for microsoft");
        one.setCompanyIcon(R.drawable.microsoft);
        homeJobsModels.add(one);
        HomeJobsModel two = new HomeJobsModel();
        two.setCompanyName("Google");
        two.setJobDetails("Working for google");
        two.setCompanyIcon(R.drawable.microsoft);
        homeJobsModels.add(two);
        HomeJobsModel three = new HomeJobsModel();
        three.setCompanyName("Microsoft");
        three.setJobDetails("Working for microsoft");
        three.setCompanyIcon(R.drawable.microsoft);
        homeJobsModels.add(three);
        HomeJobsModel four = new HomeJobsModel();
        four.setCompanyName("Microsoft");
        four.setJobDetails("Working for microsoft");
        four.setCompanyIcon(R.drawable.microsoft);
        homeJobsModels.add(four);



        adapter.setData(homeJobsModels);
        recyclerView.setAdapter(adapter);


    }
}