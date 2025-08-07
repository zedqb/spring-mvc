package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService {

    private final List<Car> cars = List.of(
            new Car("bmw", "black", 2007),
            new Car("audi", "white", 2010),
            new Car("lada", "red", 2018),
            new Car("opel", "green", 2019),
            new Car("kia", "yellow", 2020)
    );

    public List<Car> getCars(int count) {
        if (count <= 0) {
            return List.of();
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
