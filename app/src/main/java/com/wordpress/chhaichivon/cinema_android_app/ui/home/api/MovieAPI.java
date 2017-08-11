package com.wordpress.chhaichivon.cinema_android_app.ui.home.api;

import com.wordpress.chhaichivon.cinema_android_app.base.retrofit.RetrofitManager;
import com.wordpress.chhaichivon.cinema_android_app.ui.home.entity.movie.ResponseMovies;
import com.wordpress.chhaichivon.cinema_android_app.utils.Common;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/11/17
 * TIME     : 11:17 PM
 */

public class MovieAPI {
	private static final String API_END_POINT = "https://api.themoviedb.org/3/";

	public interface MovieManager{



		@GET("movie/popular?api_key="+ Common.APIKEY)
		Call<ResponseMovies> getPopularity(@Query("page") int page);
	}
	public static MovieManager getMovieManager(){
		return RetrofitManager.getAPIManager(API_END_POINT).create(MovieManager.class);
	}
}
