package HomeWork;

public class Multiplication {
    public static void main(String[] args) {
        long[] array = {1, 2, 5, 7, 10, 52, 95, 224, 77, 4};
        double[] doubleArray = {1.1, 2.5, 5.1, 7.4, 10.3, 52.8, 9.5, 22.5, 76.1, 4.3};
        multiplication(array);
        multiplication(doubleArray);
    }
    public static long multiplication(long[] array) {
        long a = 1;
        for (long b : array)
            a *= b;
        System.out.println("Multiplication: " + a);
        return a;

    }
    public static double multiplication(double[] array) {
        double aD =1;
        for(double bD : array)
            aD *= bD;
        System.out.println("Multiplication double: " + String.format("%.1f", aD));
        return aD;
    }
}
