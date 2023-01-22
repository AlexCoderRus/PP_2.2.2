package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServicelmp;
import java.util.Optional;

@Controller
public class CarController {

    private final CarServicelmp carService;
    @Autowired
    public CarController(CarServicelmp carService) {
        this.carService = carService;
    }
   // https://translated.turbopages.org/proxy_u/en-ru.ru.c14f272c-63a6156f-c5c5270d-74722d776562/https/stackoverflow.com/questions/59160936/how-to-set-default-value-on-field-values-in-a-class-used-in-spring-boot-request

    @GetMapping("/cars")
    public String cars(@RequestParam(defaultValue = "5") Optional<Integer> count, Model model) {
        model.addAttribute("carsToShow", carService.getCarList(count.orElse(0)));
        return "cars";
    }
}
