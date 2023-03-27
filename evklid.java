public class evklid {
    public static void main(String[] args) {
        System.out.println("gcd: ");
        System.out.print(gcd(140,96) + ", "); //4
        System.out.print(gcd(96, 140) + ", "); //4
        System.out.print(gcd(124222,432222) + ", "); //14
        System.out.print(gcd(2525, 4545) + ", "); //505
        System.out.println(gcd(144,144) + ", "); //144

        System.out.println("lcm :");
        System.out.print(lcm(140,96) + ", "); //3360
        System.out.print(lcm(96,140) + ", "); //3360
        System.out.print(lcm(21,5) + ", "); //105
        System.out.print(lcm(2525,4545) + ", "); //22725
        System.out.println(lcm(144,144) + ", "); //144

        System.out.println("gcd для трех чисел: " + gcd(9,gcd(18, 27))); //9
        System.out.println("lcm для трех чисел: " + lcm(9,lcm(18, 27))); //54
    }

    public static int gcd(int a, int b) {
        int mem = 1; //яйчейка памяти
        if (a < b) { //расположение делимое/делитель для расчетов ибо НОК(а,b) == НОК(b,a)
            mem = a;
            a = b;
            b = mem;
        }

        while (mem != 0) {
            mem = a % b;
            a = b;
            b = mem;
        }
        return a;
    }

    public static int lcm(int a , int b) {
        int mem;
        mem = (a * b) / gcd(a , b);
        return mem;
    }
}
