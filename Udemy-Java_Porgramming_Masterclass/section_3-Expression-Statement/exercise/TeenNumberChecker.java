public class TeenNumberChecker {
    public static void main(String[] args){
        boolean test = hasTeen(29, 99, 39);
        System.out.println(test);

        boolean test1 = isTeen(19);
        System.out.println(test1);
    }
    public static boolean hasTeen(int num1, int num2, int num3){
        if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <=19)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age){
        return (age >= 13 && age <= 19) ? true : false;
    }
}
