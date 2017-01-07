package HomeWork;

import java.util.Arrays;

public class Min {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 10, 52, 95, 224, 77, 4};
        double[] arrayDouble = {1.1, 2.5, 5.1, 7.4, 10.3, 52.8, 9.5, 22.5, 76.1, 4.3};
        min(array);
        minDouble(arrayDouble);

        System.out.println("min int array[" + ArraysUtils.min(array) + "] ");

    }

        public static int min(int array[]) {
            int min = Arrays.stream(array).min().getAsInt();

            System.out.println("Min int: " + min);
            return min;

        }

        public static double minDouble(double[] array) {
            double minDouble = Arrays.stream(array).min().getAsDouble();

            System.out.println("Min double: " + minDouble);
            return minDouble;
        }
}

