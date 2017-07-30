package com.wordpress.chhaichivon.cinema_android_app.utils;

import com.wordpress.chhaichivon.cinema_android_app.BuildConfig;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 7/30/17
 * TIME     : 9:19 AM
 */

public class Common {
	public static final int EVENT_BEGIN = 0X100;
	public static final int STATE_NOW_PLAY = EVENT_BEGIN + 10;
	public static final int STATE_TOP_RATE = EVENT_BEGIN + 20;
	public static final int STATE_POPULARITY = EVENT_BEGIN + 30;
	public static final int STATE_UPCOMING = EVENT_BEGIN + 40;
	public static final int STATE_GENRES = EVENT_BEGIN + 50;
	public static final int STATE_GENRES_MOVIES = EVENT_BEGIN + 60;
	public static final int STATE_GENRES_MOVIES_MORE = EVENT_BEGIN + 40;
	public static final String APIKEY = "118fbeb9349e606e9e0f67b7def474ac";
	public static final String IMGURL = "http://image.tmdb.org/t/p/";
	public static final String PREFS_FILE = "prefs";
	public static Boolean DEBUG_ENABLED = BuildConfig.DEBUG; // will be set to true for debug builds and false for release builds
	public static final String[] MOVIE_URLS = {"http://api-fetch.website/movies/api/v2/"};
	public static final Integer SERVER_PORT = 55723;
}
