package co.teekevonrusty.Movie.Spring.API.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MovieUser {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer Id;
	private String email;
	private String name;
	@OneToMany(mappedBy="user")
	List<MoviesPojo> movies;
	
	public MovieUser(Integer id, String email, String name, List<MoviesPojo> movies) {
		super();
		Id = id;
		this.email = email;
		this.name = name;
		this.movies = movies;
	}
	
	
	public MovieUser(String email, String name) {
		super();
		this.email = email;
		this.name = name;
	}


	public MovieUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<MoviesPojo> getMovies() {
		return movies;
	}
	public void setMovies(List<MoviesPojo> movies) {
		this.movies = movies;
	}
	@Override
	public String toString() {
		return "MovieUser [Id=" + Id + ", email=" + email + ", name=" + name + ", movies=" + movies + "]";
	}
	
	
}
