public class Challenge {
    public static void main(String[] args){
        double num1 = 20.00d; 
        double num2 = 80.00d;

        double numSum = (num1 + num2) * 100.0d;

        double remainder = numSum % 40.00d; // get the remainder by dividing by 40

        boolean noRemainder = (remainder == 0) ? true : false;

        System.out.println(noRemainder);

        if (!noRemainder){
            System.out.println("got some remainder");
        }

    }
    
}
