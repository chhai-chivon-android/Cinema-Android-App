package com.wordpress.chhaichivon.cinema_android_app.ui.home.view;

import com.wordpress.chhaichivon.cinema_android_app.base.response.BaseView;
import com.wordpress.chhaichivon.cinema_android_app.ui.home.entity.movie.ResponseMovies;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/11/17
 * TIME     : 11:16 PM
 */

public interface HomeView extends BaseView {
	/**
	 *
	 * @param responseMovies
	 */
	void responseData(ResponseMovies  responseMovies);
}
