package HomeWork;

public class Modulus {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 10, 52, 95, 224, 77, 4};
        double[] doubleArray = {1.1, 2.5, 5.1, 7.4, 10.3, 52.8, 9.5, 22.5, 76.1, 4.3};
        modulus(array);
        modulusD(doubleArray);

        System.out.println("modulus(int array[" + ArraysUtils.modulus(array) + "]), ");
    }


    public static int modulus(int array[]){
        int first = array[0];
        int last = array[array.length - 1];
        int mod = first % last;
        System.out.println("Modulus int: " + mod);
        return mod;
    }

    public static double modulusD(double[] array) {
        double firstD = array[0];
        double lastD = array[array.length - 1];
        double modD = firstD % lastD;
        System.out.println("Modulus double: " + modD);
        return modD;
    }
}