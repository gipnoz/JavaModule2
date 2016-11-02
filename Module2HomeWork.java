import java.util.Arrays;

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
        System.out.println("Sum int: " + sum + " Sum double: " + String.format("%.1f", sum1));


            int[] Array2 = {1, 2, 5, 7, 10, 52, 95, 224, 77, 4};
            int min = Arrays.stream(Array2).min().getAsInt();
            int max = Arrays.stream(Array2).max().getAsInt();

        System.out.println("Min int: " + min + " Max int: " + max);

            double[] DoubleArray2 = {1.1, 2.5, 5.1, 7.4, 10.3, 52.8, 9.5, 22.5, 76.1, 4.3};
            double minDouble = Arrays.stream(DoubleArray2).min().getAsDouble();
            double maxDouble = Arrays.stream(DoubleArray2).max().getAsDouble();

        System.out.println("Min double: " + minDouble + " Max double: " + maxDouble);


            int [] Array3 = {1, 2, 5, 7, 10, 52, 95, 224, 77, 4};
            int max3 = 0;
            for(int number : Array3)
                if(number>0 && max3<number)
                    max3 = number;
        System.out.println("Max positive int: " + max3);

            double [] DoubleArray3 = {1.1, 2.5, 5.1, 7.4, 10.3, 52.8, 9.5, 22.5, 76.1, 4.3};
            double maxDouble3 = 0;
            for(double number : DoubleArray3)
                if(number>0 && maxDouble3<number)
                    maxDouble3 = number;
        System.out.println("Max positive double: " + maxDouble3);


            long [] Array4 = {1, 2, 5, 7, 10, 52, 95, 224, 77, 4};
            long a = 1;
            for(long b : Array4)
                a *= b;
        System.out.println("Multiplication: " + a);

            double [] DoubleArray4 = {1.1, 2.5, 5.1, 7.4, 10.3, 52.8, 9.5, 22.5, 76.1, 4.3};
            double aD =1;
            for(double bD : DoubleArray4)
                aD *= bD;
        System.out.println("Multiplication double " + String.format("%.1f", aD));


            int [] Array5 = {1, 2, 5, 7, 10, 52, 95, 224, 77, 4};
            int first = Array5[0];
            int last = Array5[Array5.length - 1];
        System.out.println("First: " + first % last);
        System.out.println("Last: " + last % first);

            double [] DoubleArray5 = {1.1, 2.5, 5.1, 7.4, 10.3, 52.8, 9.5, 22.5, 76.1, 4.3};
            double firstD = DoubleArray5[0];
            double lastD = DoubleArray5[DoubleArray5.length - 1];
        System.out.println("First double: " + firstD % lastD);
        System.out.println("Last double: " + String.format("%.1f", lastD % firstD));

    }
}



