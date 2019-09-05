package co.teekevonrusty.Movie.Spring.API.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.teekevonrusty.Movie.Spring.API.entity.MovieUser;

public interface UserRepo extends JpaRepository <MovieUser, Integer> {

	
}
