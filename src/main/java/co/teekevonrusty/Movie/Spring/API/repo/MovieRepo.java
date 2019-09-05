package co.teekevonrusty.Movie.Spring.API.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.teekevonrusty.Movie.Spring.API.entity.MoviesPojo;

public interface MovieRepo extends JpaRepository <MoviesPojo, Integer> {
 
	
}
