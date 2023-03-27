import java.util.Arrays;

public class bublesort {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int a = 0; a < array.length; a++) {
            array[a] = ((int)(Math.random() * 101) - 50);
        }
        System.out.println(Arrays.toString(array));
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }

    }

}
