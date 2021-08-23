package com.riya.livecricket;

import com.riya.livecricket.modal.AllMatch;
import com.riya.livecricket.modal.DetailModal;
import com.riya.livecricket.modal.PointTable;
import com.riya.livecricket.modal.Predictions;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("fixtures?")
    Call<AllMatch> getAllMatch(@Query("CompletedFixturesCount") String CompletedFixturesCount,
                               @Query("InProgressFixturesCount") String InProgressFixturesCount,
                               @Query("UpcomingFixturesCount") String UpcomingFixturesCount);

    @GET("scorecard?jsconfig=eccn:true&")
    Call<DetailModal> getMatchDetail(@Query("FixtureId") String FixtureId);


    @GET("prediction.php")
    Call<Predictions> getPrediction();

    @GET("pointslist.php")
    Call<PointTable> getPoniTabele();

}