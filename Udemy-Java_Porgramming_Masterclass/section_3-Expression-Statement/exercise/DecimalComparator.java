public class DecimalComparator {
    public static void main(String[] args){
        boolean test = areEqualByThreeDecimalPlaces(-3.1756, -3.175);

        System.out.println(test);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        int residual1 = (int) (num1 * 1000);
        int residual2 = (int) (num2 * 1000);

        if (residual1 == residual2){
            return true;
        }

        return false;
    }
}
