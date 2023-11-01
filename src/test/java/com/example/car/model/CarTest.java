package com.example.car.model;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
public class CarTest {

    @Autowired
    private CarRegistService carRegistService;

    private static Stream<Arguments> getCar() {
        return Stream.of(
                Arguments.of("롤스로이스",
                        "고스트",
                        "팬텀",
                        700000000)
        );
    }


    @DisplayName("연습하기")
    @ParameterizedTest
    @MethodSource("getCar")
    void testCreateCar(String carName, String carOwner, String carColor, int carPrice) {
        CarDTO carInfo = new CarDTO(carName, carOwner, carColor, carPrice);

        Assertions.assertDoesNotThrow(
                () -> carRegistService.registCar(carInfo)
        );
    }
}
