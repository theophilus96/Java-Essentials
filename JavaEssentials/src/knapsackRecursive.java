import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

public class knapsackRecursive {

    public static void main(String[] args) {
        int[] weight = { 0, 1, 2, 4, 2, 5 };
        int[] value = { 0, 5, 3, 5, 3, 2 };

        // int value[] = new int[] { 60, 100, 120 };
        // int weight[] = new int[] { 10, 20, 30 };
        int cap = 10;

        int[][] arr = new int[value.length][cap + 1];
        System.out.println(knapsack(value.length - 1, cap, weight, value, arr));

        System.out.println(Arrays.deepToString(arr));

    }

    public static int knapsack(int pointer, int capacity, int[] w, int[] v, int[][] arr) {
        int result;
        if (arr[pointer][capacity] != 0) {
            result = arr[pointer][capacity];
        } else if (pointer == 0 || capacity == 0) {
            result = 0;
        } else if (w[pointer] > capacity) {
            result = knapsack(pointer - 1, capacity, w, v, arr);

        } else {
            int temp1 = knapsack(pointer - 1, capacity, w, v, arr);
            int temp2 = v[pointer] + knapsack(pointer - 1, capacity - w[pointer], w, v, arr);
            // System.out.println("value : " + v[pointer]);
            // System.out.println("weight : " + w[pointer]);

            System.out.println("pointer : " + pointer);
            System.out.println("capacity : " + capacity);
            // System.out.println("temp1 : " + temp1);
            // System.out.println("temp2 : " + temp2);

            result = Math.max(temp1, temp2);
            System.out.println("Result : " + result);
        }
        arr[pointer][capacity] = result;
        return result;

    }
}
