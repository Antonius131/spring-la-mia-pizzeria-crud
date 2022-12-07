package org.generation.italy.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.generation.italy.demo.service.DrinkService;
import org.generation.italy.demo.service.PizzaService;
import org.generation.italy.interf.PriceableInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/products")
public class PrdController {
	
	@Autowired
	PizzaService pizzaService;
	
	@Autowired
	DrinkService drinkService;
	
	@GetMapping
	public String getProducts(Model model) {
		
		List <PriceableInt> products = new ArrayList<>();
		products.addAll(pizzaService.findAll());
		products.addAll(drinkService.findAll());
		
		model.addAttribute("products", products);
		
		return "prd-home";
	}
}
