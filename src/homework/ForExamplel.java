package homework;

public class ForExamplel {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            System.out.print("-" + i);
        }
        System.out.println();
        System.out.println();

        for (int i = 2; i < 100; i++) {
            int j = i % 2;
            if (j == 0)
                System.out.print(i + " ");

        }
        System.out.println();
        System.out.println();
        int[] array = {2, 5, 8, 4, 9, 3, 7};

        int num = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > num) {
                num = array[i];
            }
        }

        System.out.println(num);

    }
}

