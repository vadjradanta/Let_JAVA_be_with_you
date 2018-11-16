package Let_JAVA_be_with_you;

import java.util.Scanner;

public class KBoardInputArray {
    public static void keyBoardArray(String[] args) {
        int [] array;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов: ");
        int count = scanner.nextInt();

        System.out.println("Введите элеметны:");

        array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Значение" + i + " =");
            array[i] = scanner.nextInt();
        }
    }
}

