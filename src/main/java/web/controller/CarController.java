package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        CarService carService = new CarServiceImpl();
        if (count != null) {
            model.addAttribute("cars", carService.listOfCar(count));
        } else {
            model.addAttribute("cars", carService.listOfCar(5));
        }
        return "cars";
    }

}
