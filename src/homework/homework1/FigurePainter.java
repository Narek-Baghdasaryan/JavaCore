package homework.homework1;

public class FigurePainter {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }
        System.out.println();

        for (int i = 0; i <=10;i++) {
            for( int j = 10;j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for(int j = 10; j > i; j--) {
                System.out.print("  ");

            }
            for(int j = 0; i + 1 > j;j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 10; i++){
            for (int j = 10; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
            for (int j = 0; j < i + 1; j++){
                System.out.print("  ");
            }
        }
        System.out.println();

        for (int i = 0; i < 9; i++) {
            for(int j = 9; j > i ; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i+1 ;j++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
         for (int i = 0; i < 10; i++ ) {
             for (int j = 10; j > i; j--) {
                 System.out.print(" *  ");
             }
             System.out.println();
             for (int j = 0; j < i+1; j++)
                 System.out.print("  ");
         }
    }
}
