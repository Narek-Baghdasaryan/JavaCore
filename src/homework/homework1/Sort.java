package homework.homework1;


public class Sort {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 3, 9, 0, 2};
        int g = array.length;
        for (int i = 0; i < g - 1; i++) {
            for (int j = 0; j < g - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
        for (int num = 0; num < array.length;num++) {
            System.out.print(array[num]+ " ");
        }
    }
}
