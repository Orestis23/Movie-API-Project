package co.teekevonrusty.Movie.Spring.API.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.teekevonrusty.Movie.Spring.API.entity.MovieFromAPI;
import co.teekevonrusty.Movie.Spring.API.entity.MovieUser;
import co.teekevonrusty.Movie.Spring.API.entity.MoviesPojo;
import co.teekevonrusty.Movie.Spring.API.repo.MovieRepo;
import co.teekevonrusty.Movie.Spring.API.repo.UserRepo;



@Controller
public class MovieController {

	@Autowired
	UserRepo UR;
	
	@Autowired
	MovieRepo MR;

	
	
	
	RestTemplate rt = new RestTemplate();
	@RequestMapping("/title-search")
	public ModelAndView movieSearch(@RequestParam("title") String movie) {
		String url = ("http://www.omdbapi.com/?apikey=c7328849&t=" + movie);
		MovieFromAPI mlist = rt.getForObject(url, MovieFromAPI.class);
		
		System.out.println(mlist);
		return new ModelAndView ("individualfilmdetails","d", mlist);
		
	}
	
	@RequestMapping("/")
	public ModelAndView homePage() {
		
		return new ModelAndView ("filmmanager");
	}
	@RequestMapping("add-list")
	public ModelAndView addToList(MoviesPojo mpDeets) {
		
		//MovieUser mlist = rt.getForObject("http://www.omdbapi.com/?apikey=c7328849&", MovieUser.class);
//		List<MoviesPojo> list1 = new ArrayList<MoviesPojo>();
//
//		for (MoviesPojo mp : mlist.getMovies()) {
//			list1.add(mpDeets);
//		
//		}
		MovieUser mu = new MovieUser();
		mu.setName("Atiba");
		mu.setEmail("tiba176@hotmail.com");
		UR.save(mu);
		mpDeets.setUser(mu);
		//MoviesPojo mp = new MoviesPojo("Test", 1999, "T","T", "T", mu);
		MR.save(mpDeets);
		return new ModelAndView("redirect:/");
		
		}
	@RequestMapping("display-list")
	public ModelAndView showList() {
		List<MoviesPojo> userList = new ArrayList<MoviesPojo>();
		
		userList = MR.findAll();
		
		return new ModelAndView("userfilmlist", "List", userList);
	}
	
	
	
}
