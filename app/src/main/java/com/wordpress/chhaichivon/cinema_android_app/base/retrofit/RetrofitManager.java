package com.wordpress.chhaichivon.cinema_android_app.base.retrofit;

import com.wordpress.chhaichivon.cinema_android_app.base.network.OKHttpManager;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/11/17
 * TIME     : 10:49 PM
 */

public class RetrofitManager {

	private static Retrofit.Builder  sInstance;

	public static Retrofit.Builder  getInstance(){
		if(sInstance == null){
			synchronized (RetrofitManager.class){
				if(sInstance ==  null){
					sInstance  = new Retrofit.Builder();
				}
			}
		}
		return sInstance;
	}

	public static Retrofit getRetrofit(String url){
		return RetrofitManager.getInstance()
				.client(OKHttpManager.getInstance())
				.addConverterFactory(ScalarsConverterFactory.create())
				.addConverterFactory(GsonConverterFactory.create())
				.baseUrl(url)
				.build();
	}

	public static Retrofit getAPIManager(String api) {
		return RetrofitManager.getRetrofit(api);
	}
}
