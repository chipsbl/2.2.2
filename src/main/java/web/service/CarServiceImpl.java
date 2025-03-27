package web.service;

import org.springframework.stereotype.Component;
import web.model.CarModel;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<CarModel> cars;

    public CarServiceImpl() {
        this.cars = new ArrayList<>();
        cars.add(new CarModel("Toyota", "Camry", 2002));
        cars.add(new CarModel("Lada", "Granta", 2008));
        cars.add(new CarModel("Datsun", "Ondo", 2006));
        cars.add(new CarModel("Ford", "Focus", 2003));
        cars.add(new CarModel("Chevrolet", "Impala", 1995));
    }


    @Override
    public List<CarModel> getAllCars(int count) {
        if (count > 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
