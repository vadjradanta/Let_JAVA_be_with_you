package Let_JAVA_be_with_you;

public class ArrayMethodsHW1 {


    /**
     * Определение чётных элементов
     * @param array в массиве
     * @return количество чётных элементов
     */
    public static int numberOfEven(int array[]) {

        int countEven = 0;

        for (int i = 0;  i < array.length; i++) {
            if((array[i] % 2 == 0) && (array[i] != 0))
                countEven++;
        }
        return countEven;
    }
    /**
     * Определяем нечётные элементы
     * @param array в массиве
     * @return количество нулей
     */
    public static int numberOfZero(int array[]) {

        int countOfZero = 0;

        for (int i = 0;  i < array.length; i++) {
            if (array[i] == 0)
                countOfZero++;
        }
        return countOfZero;
    }

    /**
     * Определяем чётные элементы
     * @param array в массиве
     * @return количество чётных элементов
     */
    public static int numberOfOdd(int[] array){
        int countOdd = 0;

        for (int i = 0;  i < array.length; i++) {
            if(array[i] % 2 != 0)
                countOdd++;
        }
        return countOdd;
    }

    /**
     * Поиск наибольшего целочисленного значения
     * @param array массива
     * @return наибольшее целочисленное значение
     */
    public static int maxInArray(int[] array) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) max = array[i];
            }
            return max;
    }

    /**
     * Поиск наименьшего целочисленного значения
     * @param array массива
     * @return наименьшее значение
     */
    public static int minInArray(int[] array) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    /**
     * Поиск индекса искомого элемента
     * @param array массива
     * @return индекс элемента
     */
    public static int[] indexElementInArray(int[] array, int element) {

        int [] index = new int[array.length];
        for(int i = 0; i < index.length; i++){
                index[i] = -1;
        }
        int counter = 0;
        for(int i = 0; i < array.length; i++) {
                if (array[i] == element) {
                    index[counter++] = i;

                    System.out.println("Искомое =" + i);
                }
        }
        return index;
    }


    /**
     * Поиск элементов с отображением в булевом массиве
     * @param array заданный массив
     * @return массив с булевым утверждением true
     */
    public static boolean[] indexBoolElementArray(int [] array, int element) {
        boolean [] index2 = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {

            if (array[i] == element) {
                index2[i] = true;
            }
        }
        return index2;
    }
}

