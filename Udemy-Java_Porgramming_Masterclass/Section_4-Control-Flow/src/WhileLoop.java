public class WhileLoop {
    public static void main(String[] args){
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        // while loop
        System.out.println("While Loop");
        int j = 1;
        while (j <= 5){
            System.out.println(j);
            j++;
        }

        // do while
        System.out.println("Do While Loop");
        int k = 1;
        boolean isReady = false;
        do {
            if (k > 5){
                break;
            }
            System.out.println(k);
            k++;
            isReady = (k > 0);
        } while (isReady);
    }
}
