public class MethodOverloading {
    public static void main(String[] args){

       int newScore = calculateScore("Kevin", 500);
        System.out.println("New score is " + newScore);

        // overloading: using the second method 
        calculateScore(75);

        // overloading: using the third method
        calculateScore();

    }

    public static int calculateScore(String playerName, int score){

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){

        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){

        System.out.println("No player name, No player score");
        return 0;
    }
}
