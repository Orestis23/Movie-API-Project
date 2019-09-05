package co.teekevonrusty.Movie.Spring.API.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MoviesPojo {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private Integer year;
	private String rated;
	private String genre;
	private String plot;
	@ManyToOne
	MovieUser user;
	
	public MoviesPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MoviesPojo(Integer id, String title, Integer year, String rated, String genre, String plot, MovieUser user) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.rated = rated;
		this.genre = genre;
		this.plot = plot;
		this.user = user;
	}

	public MoviesPojo(String title, Integer year, String rated, String genre, String plot, MovieUser user) {
		super();
		this.title = title;
		this.year = year;
		this.rated = rated;
		this.genre = genre;
		this.plot = plot;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MovieUser getUser() {
		return user;
	}

	public void setUser(MovieUser user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getRated() {
		return rated;
	}

	public void setRated(String rated) {
		this.rated = rated;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	@Override
	public String toString() {
		return "MoviesPojo [title=" + title + ", year=" + year + ", rated=" + rated + ", genre=" + genre + ", plot="
				+ plot + "]";
	}
	
	
}
