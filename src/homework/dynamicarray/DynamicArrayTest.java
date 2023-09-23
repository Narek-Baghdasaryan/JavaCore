package homework.dynamicarray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(1);
        dy.add(2);
        dy.add(3);
        dy.add(4);
        dy.add(5);
        dy.add(6);
        dy.deleteByIndex(3);
        dy.print();
        System.out.println();
        dy.set(3,7);
        dy.print();
        System.out.println();
       // dy.add(2,9);
        //dy.print();


    }
}