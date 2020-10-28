package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String Car(@RequestParam(value = "count", required = false) Integer count,
                      Model model){

        Car car1 = new Car(1, "BMW", 5);
        Car car2 = new Car(2, "KIA", 6);
        Car car3 = new Car(3, "Lada", 8);
        Car car4 = new Car(4, "Shkoda", 9);
        Car car5 = new Car(5, "Cadillac", 3);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        List<Car> newCars = new ArrayList<>();

        if (count != null && count <= 5) {
            for (int arrIndex = 0; arrIndex < count; arrIndex++) {
                newCars.add(cars.get(arrIndex));
            }
        }

        model.addAttribute("cars", count == null || count > 5 ? cars : newCars);

        return "cars";
    }
}
