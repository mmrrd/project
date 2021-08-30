package com.predictions.livecricketscore;

import com.predictions.livecricketscore.modal.AllMatch;
import com.predictions.livecricketscore.modal.DetailModal;
import com.predictions.livecricketscore.modal.PointTable;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("fixtures?")
    Call<AllMatch> getAllMatch(@Query("CompletedFixturesCount") String CompletedFixturesCount,
                               @Query("InProgressFixturesCount") String InProgressFixturesCount,
                               @Query("UpcomingFixturesCount") String UpcomingFixturesCount);

    @GET("scorecard?jsconfig=eccn:true&")
    Call<DetailModal> getMatchDetail(@Query("FixtureId") String FixtureId);


    @GET("prediction.php")
    Call<Void> getPrediction();

    @GET("pointslist.php")
    Call<PointTable> getPoniTabele();

}