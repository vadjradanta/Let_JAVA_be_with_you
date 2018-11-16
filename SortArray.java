package Let_JAVA_be_with_you;

public class SortArray {
    public static void main(String[] args) {
        int array[] = new int[]{18, 0, 7, 15, 10, 6, 1, 22};

        System.out.println("Число   чётных элементов = " + ArrayMethodsHW1.numberOfEven(array));
        System.out.println("Число нечётных элементов = " + ArrayMethodsHW1.numberOfOdd(array));
        System.out.println("Количество нулей         = " + ArrayMethodsHW1.numberOfZero(array));
    }

}
