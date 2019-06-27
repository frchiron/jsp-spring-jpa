package org.esgi.exercise.web;

import java.util.List;

import org.esgi.exercise.core.model.Person;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/person")
public class PersonController {

	/**
	 * EXERCISE 5 : Changer le get pour aller récuperer les données de la base
	 * de données en passant par le PersonService et le PersonRepository
	 * Remarque : utiliser @Autowired de Spring correspond à @Inject de Java EE
	 * l'API peut etre testé ensuite avec RestClient sous Chrome (http://localhots:8080/api/person)
	 */
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Person> get() {
		return null;
	}

	/**
	 * EXERCISE 6 : Changer le post pour inserer une personne en base de données
	 * en passant par le PersonService et le
	 * PersonRepository
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Person post(@RequestBody Person person) {
		return null;
	}

}
