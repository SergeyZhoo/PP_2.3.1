package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiсeImpl implements CarService {
    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car(1L, "Corolla", 2022));
        carList.add(new Car(2L, "Civic", 2021));
        carList.add(new Car(3L, "Mustang", 2023));
        carList.add(new Car(4L, "Cruze", 2020));
        carList.add(new Car(5L, "Altima", 2022));
    }

    public List<Car> getCars(int numberOfCars) {
        List<Car> selectedCars = new ArrayList<>();
        for (int i = 0; i < numberOfCars && i < carList.size(); i++) {
            selectedCars.add(carList.get(i));
        }
        return selectedCars;
    }
}
