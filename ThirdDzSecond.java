public class ThirdDzSecond {
    public static void main(String[] args) {
        System.out.println(area(3, 5));
        System.out.println(area(12));
        System.out.println(area(0.5, 7, 5));

    }

    public static int area(int a, int b) {
        return a * b;
    }

    public static double area(int a) {
        final double PI = 3.14;
        return PI * Math.pow(a, 2);
    }

    public static double area(double a, int b, int c) {
        return a * b * c;
    }
}
