package tddClass;

public class AirCondition {
    private boolean isAirConditionOn;
    private int temperature;

    public void isPower(boolean isAirConditionOn) {

        this.isAirConditionOn = isAirConditionOn;
    }

    public boolean getIsPower() {

        return isAirConditionOn;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }



    public void increaseTemperature() {
        if (temperature >= 30) {
            this.temperature = 30;
        }else {
            this.temperature = temperature + 1;
        }

    }

    public void decreaseTemperature() {

        if (temperature <= 16) {
            this.temperature = 16;
        }else {
            this.temperature = temperature - 1;
        }



    }

    public int getTemperature(){
        return temperature;
    }
}
//   public void doNotIncreaseAboveHighestTemp(int temperature,int highestTemperature){
//        if (temperature > highestTemperature){
//            this.temperature = temperature;
//        }
//       System.out.println("Temperature is higher than highest temperature");
//
//   }
//
//    public int getAboveHighestTemp() {
//
//        return temperature;
//    }
//
//    public void doNotIncreaseAboveLowestTemp(int temperature, int lowestTemp) {
//        if (temperature < lowestTemp){
//            this.temperature = temperature;
//        }
//        System.out.println("Temperature is lower than lowest temperature");
//    }
//
//    public int getLowestTemp() {
//        return temperature;
//    }
//
