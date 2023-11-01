package com.example.car.model;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CarRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Car save(Car car) {
        entityManager.persist(car);
        return car;
    }
}
