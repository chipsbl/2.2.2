package web.service;

import org.springframework.stereotype.Component;
import web.model.CarModel;

import java.util.List;

@Component
public interface CarService {
    List<CarModel> getAllCars(int count);
}
