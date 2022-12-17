package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = Car.createListOfCars();
        if (count == 0 || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
