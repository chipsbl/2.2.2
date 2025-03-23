package web.service;

import web.model.CarModel;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<CarModel> listOfCar(int count){
        List<CarModel> cars = new ArrayList<>();
        cars.add(new CarModel("Toyota" , "Camry", 2002));
        cars.add(new CarModel("Lada" , "Granta", 2008));
        cars.add(new CarModel("Datsun" , "Ondo", 2006));
        cars.add(new CarModel("Ford" , "Focus", 2003));
        cars.add(new CarModel("Chevrolet" , "Impala", 1995));
        if (count > 5){
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
