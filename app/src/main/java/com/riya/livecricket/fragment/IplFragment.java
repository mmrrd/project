package com.riya.livecricket.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.riya.livecricket.ApiClient;
import com.riya.livecricket.ApiInterface;
import com.riya.livecricket.R;
import com.riya.livecricket.modal.PointTable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class IplFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ipl, container, false);


        ApiInterface apiService = ApiClient.getClient("https://lifecarepost.com/rational/crick11/").create(ApiInterface.class);

        Call<PointTable> call = apiService.getPoniTabele();
        call.enqueue(new Callback<PointTable>() {
            @Override
            public void onResponse(Call<PointTable> call, Response<PointTable> response) {


                PointTable pointTable = response.body();

                Log.d("TAG", "onResponse: "+pointTable.getPointList());

            }

            @Override
            public void onFailure(Call<PointTable> call, Throwable t) {
                // Log error here since request failed
                Log.e("TAG11111", t.getMessage()+"======"+call.toString());
            }
        });


        return view;
    }
}