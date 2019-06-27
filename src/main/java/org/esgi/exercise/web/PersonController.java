package org.esgi.exercise.web;

import java.util.ArrayList;
import java.util.List;

import org.esgi.exercise.core.model.Person;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/person")
public class PersonController {

	private static List<Person> persons = new ArrayList<>();

	@RequestMapping
	public Person person() {
		return null;
	}

	@RequestMapping(path = "/{name}/{surname}")
	public Person person(@PathVariable String name, @PathVariable String surname) {
		return new Person(name, surname);
	}

	/**
	 * EXERCISE 3 : Ajouter un point d'entrée
	 * 
	 * Path : POST /person
	 * 
	 * Retour : ajoute la personne dans la liste persons et renvoie la position
	 * dans la liste
	 */
	@RequestMapping(method = RequestMethod.POST)
	public int addPerson(Person person) {
		return -1;
	}

	/**
	 * EXERCISE 4 : Ajouter un point d'entrée
	 * 
	 * Path : DELETE /person/{name}/{surname}
	 * 
	 * Retour : la personne enlevé de la liste ou un erreur 404 si pas trouvé.
	 * 
	 * NOTES : voir l'url
	 * http://docs.spring.io/spring/docs/3.0.x/javadoc-api/org/springframework/web/bind/annotation/ResponseStatus.html
	 * Avec un HttpStatus.NOT_FOUND
	 * 
	 */
	public Person removePerson(String name, String surname) {
		return null;
	}

}
