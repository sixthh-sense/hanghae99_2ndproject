package javaStudy;

public class ConstantExam {
    public static void main(String[] args) {
        int i;
        i = 10;
        i = 5;
        System.out.println(i);

        final int J;
        J = 10;
        System.out.println(J);

        final double PI = 3.14159;
        int radius = 3;
        double result = radius * 2 * PI;
        System.out.println(result);

        final int OIL_PRICE = 1450;
        int totalPrice = 50 * OIL_PRICE;
        System.out.println(totalPrice);

        int radius_quiz = 5;
        double result_quiz = radius_quiz * 2 * PI;
        System.out.println(result_quiz);
    }
}
