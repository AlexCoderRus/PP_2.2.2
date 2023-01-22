package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaolmp implements CarDao{
    private List<Car> carList = new ArrayList<>();

    {
        carList.add( new Car("Urus", "Lamborghini", 234));
        carList.add(new Car("Vesta", "Lada", 12));
        carList.add(new Car("Mondeo", "Ford", 53));
        carList.add(new Car("404", "Peugeot", 404));
        carList.add(new Car("Tuareg", "Volkswagen", 101));
    }

    @Override
    public List<Car> getCarList(int count) {
        if ((count < 0) || (count >= 5)) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
