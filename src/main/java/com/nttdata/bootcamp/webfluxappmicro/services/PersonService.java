package com.nttdata.bootcamp.webfluxappmicro.services;

import java.util.List;

import com.nttdata.bootcamp.webfluxappmicro.repositories.Person;

import reactor.core.publisher.Flux;

public interface PersonService {
	public List<Flux<Person>> allPersons();
}
