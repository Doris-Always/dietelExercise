package fuelStation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FillingStationTest {

    @Test
    public void checkForFuelInTheLocation(){
        FillingStation fillingStation = new FillingStation();

          fillingStation.checkLocation("De-D filling station 312 Herbert Macaulay");

          assertEquals("De-D filling station 312 Herbert Macaulay", fillingStation.getLocation());
    }

    @Test
    public void checkForNumberOfLitre(){
        FillingStation fillingStation = new FillingStation();

        fillingStation.setLitre(3);
        assertEquals(3,fillingStation.getNumberOfLitre());
    }

    @Test
    public void checkPercentageForQuantityBought(){
        FillingStation fillingStation = new FillingStation();
        fillingStation.setLitre(2);

        fillingStation.calculateDiscountPercentage(2,200);
        assertEquals(4,fillingStation.getDiscountPercentage());
    }

    @Test
    public void checkAmountAfterDiscount(){
        FillingStation fillingStation = new FillingStation();
        fillingStation.setLitre(3);

        fillingStation.calculateDiscountPercentage(3,200);
        fillingStation.setActualPrice();
        assertEquals(594,fillingStation.setActualPrice());
    }

}
