package Let_JAVA_be_with_you;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = new int[]{18, 0, 7, 9, 10, 6, 0, 25}; //как писал - помню, как получился верный результат - не помню

        System.out.println("Число   чётных элементов = " + nmbrOfEven(arr));
        System.out.println("Число нечётных элементов = " + (arr.length - nmbrOfEven(arr) - nmbrOfZero(arr) ) );
        System.out.println("Количество нулей         = " + nmbrOfZero(arr));
}

    public static int nmbrOfEven(int arr[]) {

        int c = 0;

        for (int i = 0;  i < arr.length; i++) {
            if((arr[i] % 2 == 0) && (arr[i] != 0))
            c++;
        }
        return c;
    }

    public static int nmbrOfZero(int arr[]) {

        int z = 0;

        for (int i = 0;  i < arr.length; i++) {
            if (arr[i] == 0)
            z++;
        }
        return z;
    }
}
