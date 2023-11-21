package classwork.chapter14;

import javax.print.attribute.HashDocAttributeSet;

public class StorageTest {

    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        stringStorage.add("Poxos");
        stringStorage.add("dasdasdasddads");
        stringStorage.print();

        Storage<Integer> integerStorage = new Storage<>();
        integerStorage . add(10);
        integerStorage. add(20);
        integerStorage.print();
    }
}
