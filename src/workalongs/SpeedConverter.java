package workalongs;

public class SpeedConverter {
    public static void main(String[] args) {
        double miles = SpeedConverter.convertToMilesPerHour(10.7);
        System.out.println(miles);
        SpeedConverter.printConversion(20);
    }

    public static long convertToMilesPerHour(double kilometerPerHour){

        if(kilometerPerHour < 0){
            return -1;
        }

        return Math.round(kilometerPerHour/1.609);
    }

    public static void printConversion(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("invalid value");
        }
        long milesPerHour = convertToMilesPerHour(kilometerPerHour);
        System.out.println( milesPerHour + "mi/h" +" " + kilometerPerHour
                            + "km/h");
    }
}
