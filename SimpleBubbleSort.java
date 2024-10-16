algorithm/src/main/java/de/telran/lesson_1_20240613/SimpleBubbleSort.java

package de.telran.lesson_1_20240613;
import java.util.Arrays;
public class SimpleBubbleSort {
    public static void main(String[] args) {
        int[] arrInt = {23, 10, 2, 7, 13, 8, 1, 66, 5, 9};
        System.out.println(Arrays.toString(arrInt));
        sortBubble(arrInt);
        System.out.println("Осортирован - "+Arrays.toString(arrInt));
    }
    static void sortBubble(int[] arrInt) {
        boolean isSorted;
        do{
            isSorted = false; // отслеживает факт перемещения
            for (int i = 0; i < arrInt.length - 1; i++) {
                if (arrInt[i] > arrInt[i + 1]) {
                    int temp = arrInt[i];
                    arrInt[i] = arrInt[i + 1];
                    arrInt[i + 1] = temp;
                    isSorted = true;
                    System.out.println(Arrays.toString(arrInt));
                }
            }
        } while (isSorted);
    }
}
