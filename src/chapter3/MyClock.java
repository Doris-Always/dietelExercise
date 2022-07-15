package chapter3;

import java.time.format.DateTimeFormatter;

public class MyClock {

    private int hour;

    private int minutes;

    private int seconds;

    public MyClock(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public MyClock() {
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (hour > 23){
            hour = 00;
        }
    }
    public int getHour() {
        return hour;
    }


    public void setMinutes(int minutes) {

        if (minutes > 59){
            minutes = 00;
            System.out.print("minutes is equal to 00");
        }else {
            this.minutes = minutes;
        }
    }

    public int getMinutes() {
        return minutes;
    }


    public void setSeconds(int seconds) {
        this.seconds = seconds;
        if (seconds > 59){
            seconds = 00;
        }
    }


    public int getSeconds() {
        return seconds;
    }


//    public int displayTime(){
//        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh:mm:ss");
//        return ;
//    }


}
