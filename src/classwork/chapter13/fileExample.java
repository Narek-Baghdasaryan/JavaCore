package classwork.chapter13;

import java.io.File;

public class fileExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\IdeaProjects\\JavaCore\\src\\classwork\\chapter13\\fileExample.java");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

    }
}
