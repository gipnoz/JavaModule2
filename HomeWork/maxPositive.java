package HomeWork;

public class maxPositive {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 10, 52, 95, -224, 77, 4};
        double [] doubleArray = {1.1, 2.5, 5.1, 7.4, 10.3, 52.8, 9.5, 22.5, -76.1, 4.3};
        max(array);
        maxDouble(doubleArray);
    }

        public static int max(int array[]){
        int max = 0;
        for(int number : array)
            if(number>0 && max<number)
                max = number;
        System.out.println("Max positive int: " + max);
        return max;
    }
        public static double maxDouble(double[] array){
            double maxDouble = 0;
            for(double number : array)
                if(number>0 && maxDouble<number)
                    maxDouble = number;
            System.out.println("Max positive double: " + maxDouble);
        return maxDouble;
        }
}
