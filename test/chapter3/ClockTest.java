package chapter3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ClockTest {

  @Test
  void displayHourMinutesSeconds(){
    MyClock clock = new MyClock(5,60,20);

    clock.setHour(5);
    clock.setMinutes(50);
    clock.setSeconds(60);

    Assertions.assertEquals(clock.getHour(),5);
    Assertions.assertEquals(clock.getMinutes(),50);
    Assertions.assertEquals(clock.getSeconds(),60);
  }

  @Test
  void displayFullTme(){
    MyClock clock = new MyClock(5,60,20);

    clock.setHour(5);
    clock.setMinutes(50);
    clock.setSeconds(60);

  }

}

