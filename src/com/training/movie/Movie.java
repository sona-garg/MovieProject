package com.training.movie;

public class Movie {
	private int movieNum;
	private String movieName;
	private int releaseYear;
	private static String movieSeriesName="Harry Potter";
	
	// Zero-Argument Constructor
	Movie(){
		movieNum=0;
		movieName="";
		releaseYear=0;
		
	}
	
	// 3-Arg Constructor
	Movie(int mNum,String mName,int rYear){
		movieNum=mNum;
		movieName=mName;
		releaseYear=rYear;
	}
	
	void setMovieNum(int mNum) {
		movieNum=mNum;
	}
	
	void setMovieName(String mName) {
		movieName=mName;
	}
	
	void setreleaseYear(int rYear) {
		releaseYear=rYear;
	}
	
	//Return movie number
	int getMovieNum() {
		return movieNum;
	}
	
	//Return movie name
	String getMovieName() {
		return movieName;
	}
	
	//Return movie release year
	int getreleaseYear() {
		return releaseYear;
	}
	static String getmovieSeriesName() {
		return movieSeriesName;
	}
	
	

}
