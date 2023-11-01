package com.example.car.model;

import javax.persistence.*;

@Entity
@Table(name = "TBL_CAR")
public class Car {

    @Id
    @Column(name = "CAR_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carNo;

    @Column(name = "CAR_NAME")
    private String carName;

    @Column(name = "CAR_OWNER")
    private String carOwner;

    @Column(name = "CAR_COLOR")
    private String carColor;

    @Column(name = "CAR_PRICE")
    private int carPrice;  // 필드 이름 변경

    public Car() {
    }

    public Car(String carName, String carOwner, String carColor, int carPrice) {
        this.carName = carName;
        this.carOwner = carOwner;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    public Long getCarNo() {
        return carNo;
    }

    public void setCarNo(Long carNo) {
        this.carNo = carNo;
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
        return "Car{" +
                "carNo=" + carNo +
                ", carName='" + carName + '\'' +
                ", carOwner='" + carOwner + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }
}
