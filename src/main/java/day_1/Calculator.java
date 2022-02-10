package day_1;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(multiple(2,10));
        System.out.println(divide(10,2));
        System.out.println(minus(10,5));
    }

    private static int add(int a, int b) {
        return a+b;
    }
    private static int multiple(int a, int b) {
        return a*b;
    }
    private static int divide(int a, int b) {
        return a/b;
    }
    private static int minus(int a, int b) {
        return a-b;
    }


}
