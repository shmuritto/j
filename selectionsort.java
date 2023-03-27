import java.util.Arrays;

public class selectionsort { //доделать пункты 2 3 4
    public static void main(String[] args) { //создание рандомного массива 1
        int[] array = new int[5];
        for (int a = 0; a < array.length; a++) {
            array[a] = ((int)(Math.random() * 101) - 50);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) { //счетчик элементов 2
            int position = i;
            int minimal = array[i];

            for (int j = i + 1; j < array.length; j++) { //поиск минимального элемента 3
                if (array[j] < minimal) {
                    position = j;
                    minimal = array[j];
                }

            }
            array[position] = array[i];//смена позиции минимального и первого сравниваемого 4
            array[i] = minimal;

        }
        System.out.println(Arrays.toString(array));
    }

}
