package com.riya.livecricket;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
 
 
public class ApiClient {
 
    public static final String BASE_URL = "https://apiv2.cricket.com.au/web/views/";
    private static Retrofit retrofit = null;
 
 
    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}