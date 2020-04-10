package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    public CarDAO cardao;
    public CarFormatter carformatter;
    public CarRatter carratter;

    public CarManager(CarDao cardao, CarFormatter carformatter, CarRatter carratter)
    {
        this.cardao=cardao;
        this.carformatter=carformatter;
        this.carratter=carratter;
    }

    public Car getCarById(final String carId)
    {
        return cardao.getCarById(carId);
    }

    public String getCarsNames()
    {
        return carformatter.getCarsNames();
    }

    public Car getBestCar()
    {
        return carratter.getBestCar();
    }



}
