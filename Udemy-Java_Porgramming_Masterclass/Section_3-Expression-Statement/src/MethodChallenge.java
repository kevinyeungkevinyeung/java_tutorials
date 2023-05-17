public class MethodChallenge {
    public static void main(String[] args){

        // test cases = 1500,1000,500,100,25

        String playerName = "Kevin";

        // test cases 1
        int playerPosition = calculateHighScorePosition(1500);
        displyHighScorePosition(playerName, playerPosition);

        // test cases 2
        playerPosition = calculateHighScorePosition(1000);
        displyHighScorePosition(playerName, playerPosition);

        // test cases 3
        playerPosition = calculateHighScorePosition(500);
        displyHighScorePosition(playerName, playerPosition);

        // test cases 4
        playerPosition = calculateHighScorePosition(100);
        displyHighScorePosition(playerName, playerPosition);

        // test cases 5
        playerPosition = calculateHighScorePosition(25);
        displyHighScorePosition(playerName, playerPosition);


    }

    public static void displyHighScorePosition(String playerName, int playerPosition){

        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}
