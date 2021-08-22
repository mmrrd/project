package com.riya.livecricket;

import com.riya.livecricket.modal.AllMatch;
import com.riya.livecricket.modal.DetailModal;
import com.riya.livecricket.modal.PointTable;
import com.riya.livecricket.modal.Predictions;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;

public interface ApiInterface {



    @GET("fixtures?CompletedFixturesCount=12&InProgressFixturesCount=12&UpcomingFixturesCount=12")
    Call<AllMatch> getAllMatch(@Header("CompletedFixturesCount") String CompletedFixturesCount,
                               @Header("InProgressFixturesCount") String InProgressFixturesCount,
                               @Header("UpcomingFixturesCount") String UpcomingFixturesCount);

    @GET("scorecard?FixtureId=10744")
    Call<DetailModal> getMatchDetail(@Header("FixtureId") String FixtureId);


    @POST("prediction.php")
    Call<Predictions> getPrediction();

    @POST("pointslist.php")
    Call<PointTable> getPoniTabele();

}