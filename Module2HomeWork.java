public class Module2HomeWork {


    public static void main(String[] args) {


        int Array[] = {1, 2, 5, 7, 10, 52, 95, 224, 77, 4};
        int sum = 0;

        for (int a : Array) {
            sum += a;
        }

        double DoubleArray[] = {1.1, 2.5, 5.1, 7.4, 10.3, 52.8, 9.5, 22.5, 76.1, 4.3};
        double sum1 = 0;
        for (double b : DoubleArray) {
            sum1 += b;
        }


        System.out.println("sum int " + sum + " sum double " + String.format("%.1f", sum1));

    }
}

