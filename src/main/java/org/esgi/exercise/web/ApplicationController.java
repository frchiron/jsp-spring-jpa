package org.esgi.exercise.web;

import org.esgi.exercise.core.model.Person;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class ApplicationController {

	@RequestMapping(path = "/")
	public @ResponseBody String helloworld() {
		return "Hello World From Spring MVC!";
	}

	/**
	 * EXERCISE 1 : Ajouter un point d'entrée
	 * 
	 * Path : GET /person
	 * 
	 * Retour : new Person("Erwan", "Kerzan")
	 */
	public Person person() {
		return null;
	}

	/**
	 * EXERCISE 2 : Ajouter un point d'entrée
	 * 
	 * Path : GET /person/{name}/{surname}
	 * 
	 * Retour : new Person(name, surname)
	 * 
	 * PISTE Voir  l'utilisation de @PathVariable
	 * http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html
	 */
	public Person person(String name, String surname) {
		return null;
	}

}
