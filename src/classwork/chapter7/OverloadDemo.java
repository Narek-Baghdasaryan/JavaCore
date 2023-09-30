package classwork.chapter7;

public class OverloadDemo {
    public static void main(String[] args) {
        class OverLoaDemo {
            void test() {
                System.out.println("parametri otsustvuyut");
            }

            void test(int a) {
                System.out.println("a:" + a);
            }

            void test(int a, int b) {
                System.out.println("a i b: " + a + " " + b);
            }
        }
    }
}