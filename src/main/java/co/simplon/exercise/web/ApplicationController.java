package co.simplon.exercise.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ApplicationController {

    // TODO Modifier la Méthode helloworld pour qu'elle retourne une liste de personnes avec nom et prénom

    @RequestMapping(path = "/")
    public @ResponseBody String helloworld() {
        return "Hello World From Spring MVC!";
    }

}
