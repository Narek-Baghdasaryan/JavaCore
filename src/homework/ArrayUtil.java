package homework;

public class ArrayUtil {
    public static void main(String[] args) {


        //2
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.println(numbers[0]);
        System.out.println();
        //3
        System.out.println(numbers.length - 1);
        System.out.println();
        //4
        System.out.println(numbers.length);
        System.out.println();



        //7
        int sizepire = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sizepire++;
            }

        }
        System.out.println(sizepire);
        System.out.println();
        //8
        int sizepire2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sizepire2++;
            }
        }
        System.out.println(sizepire2);
        System.out.println();

     //1
        for (int i = 0; i < numbers.length; i++) {
            System.out.print( "- " + numbers[i]);
        }

        }
    }
