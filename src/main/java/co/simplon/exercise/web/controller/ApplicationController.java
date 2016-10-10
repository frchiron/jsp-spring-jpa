package co.simplon.exercise.web.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ApplicationController {


    @RequestMapping(path = "/param", method = RequestMethod.GET)
    public @ResponseBody Map<String, String> param() {
        Map<String, String> params = new HashMap<>();
        params.put("key1", "value1");
        params.put("key2", "value2");
        return params;
    }

}
