public class SwitchStatement {
    public static void main(String[] args){

        int value = 1;
        // if elif else statment
        if (value==1){
            System.out.println("Value was 1");
        } else if (value==2){
            System.out.println("Value was 2");
        } else{
            System.out.println("Was not 1 or 2");
        }

        // switch statement
        System.out.println("-Traditional witch Statement");
        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, 4 or 5");
                System.out.println("Actually it was a "+ switchValue);
                break;
            default:
                System.out.println("Was not 1 to 5");
                break;
        }

        System.out.println("-Enhacned Switch Statement");
        // enhanced switch statement
        switch (switchValue){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was 3, 4 or 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }

        String month = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
   
    }

    public static String getQuarter(String month){

        // enhanced swtich expression
        return switch(month){
            case "JANUARY", "FEBUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUSGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER","NOVEMBER","DECEMBER" -> "4th";
            default -> {
                String badReponse = month + " is bad";
                yield badReponse;
            }
        };

        // switch (month){
        //     case "JANUARY": case "FEBUARY": case "MARCH":
        //         return "1st";
        //     case "APRIL": case "MAY": case "JUNE":
        //         return "2nd";
        //     case "JULY": case "AUSGUST": case "SEPTEMBER":
        //         return "3rd";
        //     case "OCTOBER": case "NOVEMBER": case "DECEMBER":
        //         return "4th";

        // }
        // return "bad";
    }
}