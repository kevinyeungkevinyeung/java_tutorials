public class IfElseChallenge {

    public static void main(String[] args){


        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your high score was " + highScore);

        // part 2
        System.out.println("Your high score was " + calculateScore(true, 10000, 8, 200));
        

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ){

        int finalScore = score;
        if (gameOver){
            finalScore += (levelCompleted * bonus);
        } 

        return finalScore;
    }
    
}
