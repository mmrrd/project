package com.riya.livecricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LiveMatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_match);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<AllMatch> call = apiService.getMatchDetail("10744");
        call.enqueue(new Callback<AllMatch>() {
            @Override
            public void onResponse(Call<AllMatch> call, Response<AllMatch> response) {


                AllMatch details = response.body();

                Log.d("TAG", "onResponse: "+response.body());


            }

            @Override
            public void onFailure(Call<AllMatch> call, Throwable t) {
                // Log error here since request failed
                Log.e("TAG", t.toString());
            }
        });

    }
}