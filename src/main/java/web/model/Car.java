package web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Character classification;
    private Integer price;

    public Car(String model, Character classification, Integer price) {
        this.model = model;
        this.classification = classification;
        this.price = price;
    }

    public static List<Car> createListOfCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Fiat 500", 'A', 2050000));
        cars.add(new Car("Mercedes-Benz S-Class", 'F', 18162685));
        cars.add(new Car("Lamborghini Huracan", 'S', 26000000));
        cars.add(new Car("Volkswagen Polo", 'B', 1437000));
        cars.add(new Car("Skoda Octavia", 'C', 1799000));
        return cars;
    }

    public String getModel() {
        return model;
    }

    public Character getClassification() {
        return classification;
    }

    public Integer getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setClassification(Character classification) {
        this.classification = classification;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
