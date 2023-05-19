public class EqualSumChecker {
    public static void main(String[] args){
        boolean test = hasEqualSum(1, 1, 2);
        System.out.println(test);
    }
    public static boolean hasEqualSum(int num1, int num2, int num3){
        int sumNum = num1 + num2;

        if (sumNum == num3){
            return true;
        }
    return false;
    }
}
