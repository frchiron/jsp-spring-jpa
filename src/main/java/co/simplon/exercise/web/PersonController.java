package co.simplon.exercise.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.exercise.core.model.Person;
import co.simplon.exercise.web.exception.ResourceNotFoundException;

@RestController
@CrossOrigin
@RequestMapping("/person")
public class PersonController {

	private static List<Person> persons = new ArrayList<>();

	@RequestMapping
	public List<Person> person() {
		return persons;
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Person person(@RequestBody Person person) {
		persons.add(person);
		return person;
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public @ResponseBody Person delete(@RequestBody Person person) {
		if (persons.contains(person)) {
			persons.remove(person);
		} else {
			throw new ResourceNotFoundException();
		}
		return person;
	}

}
