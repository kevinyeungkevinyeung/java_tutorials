package dev.Ipa;

import java.util.Arrays;

public class ArrayReferences {
    
    public static void main(String[] args){

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("Another Array = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modiftArray(myIntArray);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("Another Array = " + Arrays.toString(anotherArray));

    }

    private static void modiftArray(int[] array){
        array[1] = 2;
    }
}
