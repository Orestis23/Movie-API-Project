package co.teekevonrusty.Movie.Spring.API.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MovieFromAPI {

	@JsonProperty("Title")
	private String title;
	@JsonProperty("Year")
	private Integer year;
	@JsonProperty("Rated")
	private String rated;
	@JsonProperty("Genre")
	private String genre;
	@JsonProperty("Plot")
	private String plot;
	@JsonProperty("Actors")
	private String actors;
	
	public MovieFromAPI() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "MovieFromAPI [title=" + title + ", year=" + year + ", rated=" + rated + ", genre=" + genre + ", plot="
				+ plot + ", actors=" + actors + "]";
	}
	
	 
	
}
