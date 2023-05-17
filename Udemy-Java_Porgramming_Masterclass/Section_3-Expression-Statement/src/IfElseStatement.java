public class IfElseStatement {
    public static void main(String[] args){
        // example 1
        double kilometer = (100*1.609344);

        // example 2
        int highScore = 50;

        if (highScore > 25){
            highScore = 1000 + highScore; // add bonus points
        }

        // example 3
        int health = 100;

        if ((health < 25) && (highScore>100)){
            highScore = highScore - 1000;
        }

        // main
        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is" +
                            " another"+
                            " still more"
        );

        int anotherVariavle=50;myVariable--;System.out.println("myVariable = "+myVariable); // valid line of code

        // if then else

        boolean gameOver = true;
        int score = 999;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000){
            System.out.println("Your score was less 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

    }// method
    
}// class
