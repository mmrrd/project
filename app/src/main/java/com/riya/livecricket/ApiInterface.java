package com.riya.livecricket;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ApiInterface {



    @GET("fixtures?CompletedFixturesCount=12&InProgressFixturesCount=12&UpcomingFixturesCount=12")
    Call<AllMatch> getAllMatch(@Header("CompletedFixturesCount") String CompletedFixturesCount,
                               @Header("InProgressFixturesCount") String InProgressFixturesCount,
                               @Header("UpcomingFixturesCount") String UpcomingFixturesCount);

    @GET("scorecard?FixtureId=10744")
    Call<AllMatch> getMatchDetail(@Query("FixtureId") String FixtureId);

}