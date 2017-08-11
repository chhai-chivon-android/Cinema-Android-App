package com.wordpress.chhaichivon.cinema_android_app.base.response;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/11/17
 * TIME     : 10:42 PM
 */

public interface BaseView {
	/**
	 *
	 * @param message
	 */
	void showError(String message);

	/**
	 *
	 * @param message
	 */
	void showException(String message);
}
