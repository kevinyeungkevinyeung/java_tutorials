public class ForStatement {
    public static void main(String[] args){

        for (int counter =1; counter <= 5; counter++){
            System.out.println(counter);
        }

        for (double interestRate = 7.5; interestRate <= 10.0; interestRate += 0.25){
            System.out.println("$10,000 at " + interestRate + "% interest = " + calculateInterest(10000.0, interestRate));
        }
        
    }

    public static double calculateInterest(double amount, double interestRate){
            return (amount * (interestRate/100));
    }
}
