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
import com.riya.livecricket.modal.AllMatch;
import com.riya.livecricket.modal.Predictions;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FantasyFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fantasy, container, false);


        ApiInterface apiService = ApiClient.getClient("https://lifecarepost.com/rational/crick11/").create(ApiInterface.class);

        Call<Predictions> call = apiService.getPrediction();
        call.enqueue(new Callback<Predictions>() {
            @Override
            public void onResponse(Call<Predictions> call, Response<Predictions> response) {


//                Predictions predictions = response.body();

                Log.d("TAG", "onResponse: "+response.body());

            }

            @Override
            public void onFailure(Call<Predictions> call, Throwable t) {
                // Log error here since request failed
                Log.e("TAG11111", t.getMessage()+"======"+call.toString());
            }
        });



                return view;
    }
}