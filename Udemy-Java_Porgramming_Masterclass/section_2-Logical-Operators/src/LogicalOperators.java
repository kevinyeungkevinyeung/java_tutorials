public class LogicalOperators {
    public static void main(String[] args){
        System.out.println("Hello, Kevin");
        
        boolean isAlien = false;

        if (isAlien==false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore == 100){
            System.out.println("You got the high score !");
        }

        // And operator
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        // Or operator
        if ((topScore>90)||(secondTopScore<=90)){
            System.out.println("Either or both the condition are true");
        }

        boolean isCar = false;

        // not 
        if (!isCar){
            System.out.println("Not Car");
        }

        // ternary operator
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true ; // first part is conditonal operator, second part if true, third part if false
        
        if (isDomestic){
            System.out.println("This cat is domestic to our country");
        }

        

    }
}
