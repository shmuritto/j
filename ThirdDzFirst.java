public class ThirdDzFirst {
    public static void main(String[] args) {
        System.out.println(compare(1, 2) == 1);
        System.out.println(compare(8223372036854775L, -5223372036854775L) == -5223372036854775L);
        System.out.println(compare(1.1, 2.1) == 1.1);

    }

    static int compare(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }


    static double compare(double a, double b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    static long compare(long a, long b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}