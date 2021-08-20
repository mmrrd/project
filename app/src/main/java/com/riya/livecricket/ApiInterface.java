package com.riya.livecricket;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("teams")
    Call<Teams> getData(@Query("api_token") String apiKey);

    @GET("fixtures?CompletedFixturesCount=12&InProgressFixturesCount=12&UpcomingFixturesCount=12")
    Call<AllMatch> getAllMatch();

}