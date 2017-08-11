package com.wordpress.chhaichivon.cinema_android_app.utils;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/6/17
 * TIME     : 2:19 AM
 */

public interface BaseResponseListener<T> {

	void onSuccess(T data);

	void onError(String message);

	void onException(String message);
}
