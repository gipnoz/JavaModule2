package HomeWork;

public class Sum {
    public static void main(String[] args) {

        int Array[] = {1, 2, 5, 7, 10, 52, 95, 224, 77, 4};
        double DoubleArray[] = {1.1, 2.5, 5.1, 7.4, 10.3, 52.8, 9.5, 22.5, 76.1, 4.3};

        sum(Array);
        sumDouble(DoubleArray);
    }

        public static int sum(int array[]) {
            int sum = 0;
            for (int a : array) {
                sum += a;
            }
            System.out.println("Sum int: " + sum);

            return sum;
        }

        public  static double sumDouble(double[] array){
        double sum = 0;
        for (double b : array) {
            sum += b;
    }
        System.out.println("Sum double: " + sum);
            //Выглядит приятнее
            //System.out.println(" Sum double: " + String.format("%.1f", sum));

            return sum;
    }
}
