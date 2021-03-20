package com.cg.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class FrontController {
	
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	public ModelAndView getAllCustomers()
	{
		ModelAndView mv=new ModelAndView("showall");
		RestTemplate template =new RestTemplate();
		List<Customer>list=template.getForObject("http://localhost:9395/getall",ArrayList.class);
		mv.addObject("customers", list);
		return mv;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView mv=new ModelAndView("add_customer");
		mv.addObject("command",new Customer());
		return mv;
	}
	
	@RequestMapping(value="/addc", method=RequestMethod.POST)
	public String addCustomer(Customer c) {
		
		RestTemplate template =new RestTemplate();
		template.postForObject("http://localhost:9395/add",c,String.class);
		return "redirect:/getall";
		
	}

		@RequestMapping(value="/delete",method=RequestMethod.GET)
		public String Delete(@RequestParam("id") int id) {
			RestTemplate template =new RestTemplate();	
			template.postForObject("http://localhost:9395/delete", id, String.class);
			return "redirect:/getall";
		}
		@RequestMapping(value="/update", method=RequestMethod.GET)
		public ModelAndView update(@RequestParam("id") int id,@RequestParam("name") String name) {
			ModelAndView  mv=new ModelAndView("update");
		
			mv.addObject( "id" ,new Integer(id));
			mv.addObject("name", new String(name));
			mv.addObject("command",new Customer());
			return mv;
		}
		
		@RequestMapping(value="/update1", method=RequestMethod.POST)
		public String update1(Customer c) {
			RestTemplate template =new RestTemplate();	
			template.postForObject("http://localhost:9395/update", c, String.class);
			return "redirect:/getall";
		}
		
	}
	
