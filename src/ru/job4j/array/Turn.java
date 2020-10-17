package ru.job4j.array;

public class Turn {
    public static  int[] back(int[] array) {
        int temp;
        for (int i = array.length - 1, j = 0; i >= array.length / 2; i--, j++) {
           temp = array[j];
           array[j] = array[i];
           array[i] = temp;
        }
        return  array;
    }
}
   /*
   public static int[] back(int[] array) {
        int j = 0;
        int[] res = new int[array.length]; // временный массив.
        for (int i = array.length - 1; i >= 0; i--, j++) {
         res[j] = arr[i];
         }
    */