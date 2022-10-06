package com.nttdata.bootcamp.webfluxappmicro.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.nttdata.bootcamp.webfluxappmicro.repositories.Person;

import reactor.core.publisher.Flux;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public List<Flux<Person>> allPersons() {
		WebClient webClient = WebClient.create("http://localhost:8080");
		
		Flux<Person> personList1 = webClient.get()
				.uri("/person-list-1")
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.retrieve()
				.bodyToFlux(Person.class);
			
		Flux<Person> personList2 = webClient.get()
				.uri("/person-list-2")
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.retrieve()
				.bodyToFlux(Person.class);
		
		Flux<Person> personList3 = webClient.get()
				.uri("/person-list-3")
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.retrieve()
				.bodyToFlux(Person.class);
		
		Flux<Person> personList4 = webClient.get()
				.uri("/person-list-4")
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.retrieve()
				.bodyToFlux(Person.class);
		
		List<Flux<Person>> allPersons = new ArrayList<>();
		
		allPersons.add(personList1);
		allPersons.add(personList2);
		allPersons.add(personList3);
		allPersons.add(personList4);
			
			
		return allPersons;
	}

}
