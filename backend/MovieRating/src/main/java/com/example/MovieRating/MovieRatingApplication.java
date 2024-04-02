package com.example.MovieRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.MovieRating.repository.MovieRepository;
@SpringBootApplication
public class MovieRatingApplication {

	@Autowired
	private MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingApplication.class, args);
	}

}
