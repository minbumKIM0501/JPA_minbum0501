package com.example.car.model;



public class CarDTO {

    private String carName;
    private String carOwner;
    private String carColor;
    private int carPrice;

    public CarDTO() {
    }

    public CarDTO(String carName, String carOwner, String carColor, int carPrice) {
        this.carName = carName;
        this.carOwner = carOwner;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "carName='" + carName + '\'' +
                ", carOwner='" + carOwner + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }
}
