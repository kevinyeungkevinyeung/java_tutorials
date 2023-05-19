public class BarkingDog {
 public static void main(String[] args){
    boolean bark = shouldWakeUp(true, 23);

    System.out.println(bark);
 }  
 
 public static boolean shouldWakeUp(boolean barking, int hourOfDay){

    if (barking) {
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        else if (hourOfDay<8 || hourOfDay>22){
            return true;
        } 
    } 
    return false;
}
}
