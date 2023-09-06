package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;


@Controller
public class CarController {

    private final CarService cs;
    @Autowired
    public CarController(CarService cs){
        this.cs = cs;
    }
    @GetMapping(value = "/cars")
    public String index(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("cars", cs.getCar(count));
        return "cars";
    }
}
