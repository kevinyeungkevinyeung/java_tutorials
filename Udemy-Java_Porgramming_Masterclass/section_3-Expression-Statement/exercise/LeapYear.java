public class LeapYear {
    public static void main(String[] args){
        boolean test = isLeapYear(1800);

        System.out.println(test);
    }

    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            int remainder4 = year % 4;
            int remainder100 = year % 100;
            int remainder400 = year % 400;

            if (remainder4 == 0 && remainder100 != 0){
                return true;
            } else if (remainder4 == 0 && remainder100 == 0 && remainder400 == 0){
                return true;
            }

        }

        return false;
    }
}
