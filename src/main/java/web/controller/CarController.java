package web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;

@Controller
@RequestMapping
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(defaultValue = "5", name = "count") int count, Model model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
