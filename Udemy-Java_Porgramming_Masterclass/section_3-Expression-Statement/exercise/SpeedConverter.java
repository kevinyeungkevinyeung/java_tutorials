public class SpeedConverter {
    public static void main(String[] args){

        printConversion(1.5);

    }

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour<0){
            return -1L;
        } else {
            double milesPerHour = kilometersPerHour / 1.609;
            long roundMilesPerHour = Math.round(milesPerHour);
            return roundMilesPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour){

        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (kilometersPerHour<0){
            System.out.println("Invalid Value");
        } else{
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + " mi/h");
        }
        
    }
}
