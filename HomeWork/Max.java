package HomeWork;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 10, 52, 95, 224, 77, 4};
        double[] arrayDouble = {1.1, 2.5, 5.1, 7.4, 10.3, 52.8, 9.5, 22.5, 76.1, 4.3};
        max(array);
        maxDouble(arrayDouble);
    }

    public static int max(int array[]) {
        int max = Arrays.stream(array).max().getAsInt();

        System.out.println("Max int: " + max);
        return max;
    }

    public static double maxDouble(double[] array) {
        double maxDouble = Arrays.stream(array).max().getAsDouble();

        System.out.println("Max double: " + maxDouble);
        return maxDouble;
        }
    }

