package Let_JAVA_be_with_you;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = new int[]{18, 0, 7, 15, 10, 6, 1, 22};

        System.out.println("Число   чётных элементов = " + numberOfEven(arr));
        System.out.println("Число нечётных элементов = " + numberOfOdd(arr));
        System.out.println("Количество нулей         = " + numberOfZero(arr));
}

    /**
     * Определение чётных элементов
     * @param arr в массиве
     * @return количество чётных элементов
     */
    public static int numberOfEven(int[] arr) {

        int countEven = 0;

        for (int i = 0;  i < arr.length; i++) {
            if((arr[i] % 2 == 0) && (arr[i] != 0))
                countEven++;
        }
        return countEven;
    }

    /**
     * Определяем нечётные элементы
     * @param arr в массиве
     * @return количество нулей
     */
    public static int numberOfZero(int arr[]) {

        int countZero = 0;

        for (int i = 0;  i < arr.length; i++) {
            if (arr[i] == 0)
                countZero++;
        }
        return countZero;
    }

    /**
     * Определяем чётные элементы
     * @param arr в массиве
     * @return количество чётных элементов
     */
    public static int numberOfOdd(int[] arr){
        int countOdd = 0;

        for (int i = 0;  i < arr.length; i++) {
            if(arr[i] % 2 != 0)
                countOdd++;
        }
        return countOdd;
    }
}
