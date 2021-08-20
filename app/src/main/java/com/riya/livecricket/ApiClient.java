package com.riya.livecricket;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
 
 
public class ApiClient {
 
//    public static final String BASE_URL = "https://cricket.sportmonks.com/api/v2.0/";
    private static Retrofit retrofit = null;
 
 
    public static Retrofit getClient(String str) {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(str)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}