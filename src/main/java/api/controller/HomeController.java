package api.controller;

import api.entity.HomePage;
import api.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @Autowired
    private HomeService service;

    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/home/",method = RequestMethod.GET)
    public HomePage hello(){
        return service.save(new HomePage("Hello World"));
    }
}
