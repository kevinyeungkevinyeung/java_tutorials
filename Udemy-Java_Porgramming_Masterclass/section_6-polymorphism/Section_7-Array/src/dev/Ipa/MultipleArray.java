package dev.Ipa;

import java.util.Arrays;

public class MultipleArray {

    public static void main(String[] args){

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for (int[] outer : array2){
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++){
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        for (var outer : array2){
            for (var element : outer){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array2));

        array2[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(array2));
    }
    

}
