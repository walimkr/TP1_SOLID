package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarRatter{
    public Car getBestCar()
    {
        List<Car> carsDb = cardao.getCars();
        Car bestCar = null;
        for (Car car : carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
