package com.wordpress.chhaichivon.cinema_android_app.ui.home.presenter;

import com.wordpress.chhaichivon.cinema_android_app.ui.home.entity.movie.ResponseMovies;
import com.wordpress.chhaichivon.cinema_android_app.ui.home.interactor.HomeInteractor;
import com.wordpress.chhaichivon.cinema_android_app.ui.home.interactor.HomeInteractorImpl;
import com.wordpress.chhaichivon.cinema_android_app.ui.home.view.HomeView;
import com.wordpress.chhaichivon.cinema_android_app.utils.BaseResponseListener;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/11/17
 * TIME     : 11:29 PM
 */

public class HomePresenterImpl implements HomePresenter,BaseResponseListener<ResponseMovies> {

	private HomeView homeView;
	private HomeInteractor homeInteractor;

	public HomePresenterImpl(HomeView homeView){
		this.homeView = homeView;
		this.homeInteractor = new HomeInteractorImpl(this);

	}

	@Override
	public void onSuccess(ResponseMovies data) {
		homeView.responseData(data);
	}

	@Override
	public void onError(String message) {
		homeView.showException(message);
	}

	@Override
	public void onException(String message) {
		homeView.showException(message);
	}

	@Override
	public void requestData(int page) {
		homeInteractor.requestData(page);
	}
}
