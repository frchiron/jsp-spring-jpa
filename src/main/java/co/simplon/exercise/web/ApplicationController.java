package co.simplon.exercise.web;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ApplicationController {

    // TODO Modifier la Méthode helloworld pour qu'elle retourne une liste de personnes avec nom et prénom

    @RequestMapping(path = "/")
    public @ResponseBody String helloworld() {
        return "Hello World From Spring MVC!";
    }

}
