package com.wordpress.chhaichivon.cinema_android_app.utils;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/6/17
 * TIME     : 2:11 AM
 */

public interface BaseMultiView {
	/**
	 * @param event
	 * @param message
	 */
	void showError(int event, String message);

	/**
	 * @param message
	 */
	void showException(String message);
}
