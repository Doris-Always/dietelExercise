package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirConditionTest {


    @Test
    @DisplayName("is AirConditioner on or off")
    public void isAirConditionOnOrOff() {
        //given
        AirCondition airCondition = new AirCondition();
        //when
        airCondition.isPower(false);
         //assert/check
        assertEquals( true, airCondition.getIsPower());

    }

    @Test
    @DisplayName("Increasing Ac temperature")
    public void increaseTemperature(){
        //given
        AirCondition airCondition = new AirCondition();
        //when
        airCondition.isPower(true);

        airCondition.setTemperature( 16);
        airCondition.increaseTemperature();
//        //check
        assertEquals(17, airCondition.getTemperature());

    }





    @Test
    @DisplayName("Decreasing Temperature")
    public void decreaseTemperature(){
        //given
        AirCondition airCondition = new AirCondition();
        //when
        airCondition.isPower(true);
        airCondition.setTemperature(25);
        airCondition.decreaseTemperature();
        //check
        assertEquals(24, airCondition.getTemperature());
    }

    @Test
    @DisplayName("Check that the temperature do not exceed lowest temperature")
    public void checkTheTemperatureDoNotExceedLowestTemp(){

        //given
        AirCondition airCondition = new AirCondition();
        //when
        airCondition.isPower(true);
        airCondition.setTemperature(16);
        airCondition.decreaseTemperature();
        airCondition.decreaseTemperature();
        airCondition.decreaseTemperature();


        //check
        assertEquals(16,airCondition.getTemperature());


    }

    @Test
    @DisplayName("Check that the temperature do not exceed highest temperature")
    public void checkTheTemperatureDoNotExceedHighestTemp(){

        //given
        AirCondition airCondition = new AirCondition();
        //when
        airCondition.isPower(true);
        airCondition.setTemperature(30);
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();


        //check
        assertEquals(30,airCondition.getTemperature());


    }




}
