package com.wordpress.chhaichivon.cinema_android_app.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wordpress.chhaichivon.cinema_android_app.network.OKHttpManager;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 7/30/17
 * TIME     : 7:15 AM
 */

public class RetrofitManager {
	public static Retrofit.Builder  sInstance;

	public static Retrofit.Builder  getInstance(){
		if(sInstance != null){
			synchronized (RetrofitManager.class){
				if(sInstance == null){
					sInstance  = new Retrofit.Builder();
				}
			}
		}
		return sInstance;
	}
	private static Retrofit getRetrofit(String url) {
		return RetrofitManager.getInstance()
				.client(OKHttpManager.getInstance())
				.addConverterFactory(ScalarsConverterFactory.create())
				.addConverterFactory(GsonConverterFactory.create())
				.baseUrl(url)
				.build();
	}

    /*private static GsonConverterFactory refactoryGson() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(ResponseData.class, new ResponseMovieDeserialize());
        Gson myGson = builder.create();
        return GsonConverterFactory.create(myGson);
    }

    private static GsonConverterFactory refactoryListGson() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(ResponseMoviesList.class, new ResponseMoviesListDeserialize());
        Gson myGson = builder.create();
        return GsonConverterFactory.create(myGson);
    }*/

    public static Retrofit getAPIManager(String api) {
        return RetrofitManager.getRetrofit(api);
    }

}
