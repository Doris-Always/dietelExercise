package chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarApplication {

    @BeforeEach
    void setUp() {
    }

    Car car1 = new Car();
    Car car2=new Car();


    @Test
    void carCapabilities(){
        car1.setModel("rolls rhoyce");
        car1.setYear("2015");
        car1.setPrice(59.2);

        Assertions.assertEquals(car1.getModel(), "rolls rhoyce");
        Assertions.assertEquals(car1.getPrice(), 59.2);
        Assertions.assertEquals(car1.getYear(), "2015");
    }

    @Test
    void testThatCanDisplayPrice(){
        car1.setPrice(60);
        car2.setPrice(100);
        Assertions.assertEquals(car1.displayPrice(), 60);
        Assertions.assertEquals(car2.displayPrice(), 100);
    }

    @Test
    void testThatCanAssertDiscount(){
        car1.setPrice(45);
        car2.setPrice(34);
        Assertions.assertEquals(car1.withDiscount(0.05), 42.75);
        Assertions.assertEquals(car2.withDiscount(0.07), 31.62);
    }

    @AfterEach
    void tearDown() {
    }
}