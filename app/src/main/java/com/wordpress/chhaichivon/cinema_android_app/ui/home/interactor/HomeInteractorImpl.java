package com.wordpress.chhaichivon.cinema_android_app.ui.home.interactor;

import com.wordpress.chhaichivon.cinema_android_app.ui.home.api.MovieAPI;
import com.wordpress.chhaichivon.cinema_android_app.ui.home.entity.movie.ResponseMovies;
import com.wordpress.chhaichivon.cinema_android_app.utils.BaseResponseListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/11/17
 * TIME     : 11:34 PM
 */

public class HomeInteractorImpl implements HomeInteractor {

	private BaseResponseListener<ResponseMovies> responseMoviesBaseResponseListener;

	public HomeInteractorImpl(BaseResponseListener<ResponseMovies> responseMoviesBaseResponseListener){
		this.responseMoviesBaseResponseListener = responseMoviesBaseResponseListener;
	}

	@Override
	public void requestData(int page) {
		Call<ResponseMovies> call = MovieAPI.getMovieManager().getPopularity(1);
		call.enqueue(new Callback<ResponseMovies>() {
			@Override
			public void onResponse(Call<ResponseMovies> call, Response<ResponseMovies> response) {
				if(!response.isSuccessful()) responseMoviesBaseResponseListener.onException(response.errorBody().toString());
				ResponseMovies data = response.body();
				if(null == data) return;
				responseMoviesBaseResponseListener.onSuccess(data);
			}
			@Override public void onFailure(Call<ResponseMovies> call, Throwable t) {
				responseMoviesBaseResponseListener.onError(t.getLocalizedMessage());
			}
		});
	}
}
