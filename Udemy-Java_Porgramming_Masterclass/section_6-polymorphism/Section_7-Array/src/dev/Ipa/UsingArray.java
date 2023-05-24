package dev.Ipa;

import java.util.Random;
import java.util.Arrays;
import java.util.Collection;

public class UsingArray {
    
    public static void main(String[] args){
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);

        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0){
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(s1, s2)){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Array are not equal");
        }

        // challenage reverse sort a random array

        int[] randomArray = getRandomArray(10);
        System.out.println(Arrays.toString(randomArray));
        sortIntegers(randomArray);        
        System.out.println(Arrays.toString(randomArray));

    }

    private static int[] getRandomArray(int len){

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }

    private static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;

            for (int i = 0; 1 < sortedArray.length - 1; i++){

                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] =  sortedArray[i + 1];
                    sortedArray[i + 1] =  temp;
                    flag = true;
                }
            }
        }

        System.out.println(Arrays.toString(sortedArray));
        return sortedArray;
    }
}
