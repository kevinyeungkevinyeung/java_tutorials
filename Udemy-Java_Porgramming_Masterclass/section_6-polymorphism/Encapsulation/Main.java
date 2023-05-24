public class Main {
    public static void main(String[] args){

        // Player player = new Player();
        // player.name = "Tim";
        // player.health = 20;
        // player.weapon = "Sword";

        // int demange = 10;
        // player.loseHealth(demange);
        // System.out.println("Remaining Health = " + player.healthRemaining());

        // player.health = 200;

        // player.loseHealth(11);
        // System.out.println("Remaining Health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim");

        System.out.println("Initial health is " + tim.healthRemaining());
    }
}
