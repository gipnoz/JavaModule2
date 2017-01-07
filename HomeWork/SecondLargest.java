package HomeWork;


public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 10, 52, 95, -224, 77, 4};
        double[] doubleArray = {1.1, 2.5, 5.1, 7.4, 10.3, 52.8, 9.5, 22.5, 76.1, 4.3};
        secondLargest(array);
        secondLargestD(doubleArray);

        System.out.println("secondLargest(int array[" + ArraysUtils.secondLargest(array)+ "]), ");
    }

        public static int secondLargest(int array[]){
            int largest = array[0];
            int secondLargest = array[0];
            for (int number : array)
                if (number > largest) {
                    secondLargest = largest;
                    largest = number;
                } else if (number > secondLargest)
                secondLargest = number;
        System.out.println("Second largest: " + secondLargest);
            return secondLargest;
    }

        public static double secondLargestD(double[] array){
            double largest = array[0];
            double secondLargestD = array[0];
            for (double number : array)
                if (number > largest) {
                    secondLargestD = largest;
                    largest = number;
                } else if (number > secondLargestD)
                    secondLargestD = number;
            System.out.println("Second largest: " + secondLargestD);
            return secondLargestD;

        }
}
