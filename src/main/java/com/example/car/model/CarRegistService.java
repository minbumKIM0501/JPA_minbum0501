package com.example.car.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarRegistService {

    private CarRepository carRepository;

    @Autowired
    public CarRegistService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void registCar(CarDTO carInfo) {
        Car car = new Car(
                carInfo.getCarName(),
                carInfo.getCarOwner(),
                carInfo.getCarColor(),
                carInfo.getCarPrice()
        );

        carRepository.save(car);
    }

}
