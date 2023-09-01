package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private final List<Car> carList = new ArrayList<>();

    public CarDAOImpl() {
        carList.add(new Car(1L, "Corolla", 2022));
        carList.add(new Car(2L, "Civic", 2021));
        carList.add(new Car(3L, "Mustang", 2023));
        carList.add(new Car(4L, "Cruze", 2020));
        carList.add(new Car(5L, "Altima", 2022));
    }

    @Override
    public List<Car> getCars(int numberOfCars) {
        return carList.subList(0, Math.min(numberOfCars, carList.size()));
    }
}
