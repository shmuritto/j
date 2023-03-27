public class loop {
    public static void main(String[] args) {
        int countDown = 10;

        while (countDown >= 0) {
            System.out.println("cчетчик: " + countDown);
            countDown--;
        }

        int i = 1;
        while(true) {
            System.out.println("расчет" + i);
            if (i > 3) {
                break;
            }
            i++;
        }

        int j = 2;
        do {
            System.out.println("дуваля" + j);
            j++;
        } while (j <12);

        System.out.println("готово");
    }
}
