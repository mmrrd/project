package com.riya.livecricket;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
 
 
public class ApiClient {
 
//    public static final String BASE_URL = "https://apiv2.cricket.com.au/web/views/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient(String str) {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(str)
                    .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                    .build();
        }
        return retrofit;
    }
//    public static Retrofit getClient1(String str) {
//        if (retrofit==null) {
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(str)
//                    .client(new OkHttpClient.Builder().build())
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//        return retrofit;
//    }
}