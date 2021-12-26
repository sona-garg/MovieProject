package com.training.movie;

public class MovieDemo {

	public static void main(String[] args) {
		//calling static method with class name only
		System.out.println("Movie Series name is:"+Movie.getmovieSeriesName());
		// calling constructor without parameters
		Movie M1 = new Movie();
		System.out.println("The movie number is:"+M1.getMovieNum());
		System.out.println("The movie name is:"+M1.getMovieName());
		System.out.println("The movie release Year is:"+M1.getreleaseYear());
		System.out.println("----------------------------------");
		// calling constructor with 2 parameters
		Movie M2=new Movie(1,"Harray Potter2",2002);
		System.out.println("The movie number is:"+M2.getMovieNum());
		System.out.println("The movie name is:"+M2.getMovieName());
		System.out.println("The movie release Year is:"+M2.getreleaseYear());
		System.out.println("----------------------------------");
		// calling constructor with 3 parameters
		Movie M3=new Movie(2,"Harray Potter3",2003);
		System.out.println("The movie number is:"+M3.getMovieNum());
		System.out.println("The movie name is:"+M3.getMovieName());
		System.out.println("The movie release Year is:"+M3.getreleaseYear());
		
	}
	

}
