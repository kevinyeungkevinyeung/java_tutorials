public class PlayingCat {
    public static void main(String[] args){
        boolean test = isCatPlaying(false,35);
        System.out.println(test);
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer && (temperature < 25 || temperature > 45)){
            return false;
        } else if (!summer && (temperature < 25 || temperature > 35)){
            return false;
        }

        return true;
    }
}
