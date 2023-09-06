package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Hyndai", "Solaris", "Sedan"));
        cars.add(new Car("Volkswagen", "Tiguan", "SUV"));
        cars.add(new Car("Volkswagen", "Polo", "Sedan"));
        cars.add(new Car("Renault", "Logan", "Sedan"));
        cars.add(new Car("Skoda", "Octavia", "Combi"));
    }

    @Override
    public List<Car> getCar(Integer quantity){
        if(quantity == null || quantity >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, quantity);
        }
    }
}
