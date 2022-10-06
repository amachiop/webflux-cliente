package com.nttdata.bootcamp.webfluxappmicro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.webfluxappmicro.repositories.Person;
import com.nttdata.bootcamp.webfluxappmicro.services.PersonService;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/person-list")
	public String personList(Model model) {
		List<Flux<Person>> personList = personService.allPersons();
		model.addAttribute("personList", personList);
		return "personsList";
		//no se por que no entra en el html de personsList, asi que no lo he podido probar mas
	}

}
