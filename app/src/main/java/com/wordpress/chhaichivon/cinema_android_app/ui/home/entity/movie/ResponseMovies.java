package com.wordpress.chhaichivon.cinema_android_app.ui.home.entity.movie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 7/30/17
 * TIME     : 9:09 AM
 */

public class ResponseMovies {

	@SerializedName("page")
	@Expose
	private int page;

	@SerializedName("total_pages")
	@Expose
	private int totalPages;

	@SerializedName("results")
	@Expose
	private List<Movie> results;

	@SerializedName("total_results")
	@Expose
	private int totalResults;

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public void setResults(List<Movie> results){
		this.results = results;
	}

	public List<Movie> getResults(){
		return results;
	}

	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}

	public int getTotalResults(){
		return totalResults;
	}
}
