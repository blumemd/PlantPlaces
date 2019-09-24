package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlantPlacesController {
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read()
	{
		return "start";
	}
	
	@PostMapping(value="/start")
	public String create()
	{
		return "start";
	}
	
	@RequestMapping("/index")
	public String index()
	{
		return "start";
	}
}
