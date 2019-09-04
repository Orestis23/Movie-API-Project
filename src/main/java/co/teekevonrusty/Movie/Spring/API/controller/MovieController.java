package co.teekevonrusty.Movie.Spring.API.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.teekevonrusty.Movie.Spring.API.entity.MoviesPojo;



@Controller
public class MovieController {

	RestTemplate rt = new RestTemplate();
	@RequestMapping("/search-results")
	public ModelAndView movieSearch(String movie) {
		String url = ("http://www.omdbapi.com/?apikey=c7328849&t=" + movie);
		MoviesPojo mlist = rt.getForObject(url, MoviesPojo.class);
		
		return new ModelAndView ("search-results", "msg", mlist);
	}
	
}
