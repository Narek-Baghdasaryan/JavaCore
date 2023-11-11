package homework.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        fileSearch();
        // contentSearch();
        // findLines();
        printSizeOfPackage();
        createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("FILE SEARCH (1)");
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
        System.out.println("please input file path");
        String path = scanner.nextLine();
        System.out.println("please input file name ");
        String fileName = scanner.nextLine();
        File file = new File(path + File.separator + fileName);
        System.out.println(file.exists());
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {

    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("PRINT SIZE OF PACKAGE (4)");
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
        System.out.println("Please input directary");
        String path = scanner.nextLine();
        File[] files = new File(path).listFiles();
        long filePlace = 0;
        if (files == null) {
            System.out.println ("file doesn't exist");
            return;
        }
        for (File file : files) {
            System.out.println(file.getName() + " " + file.length() + " byte");
            filePlace += file.length();
        }
        System.out.println(filePlace + " byte");
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("CREATE FILE WITH CONTENT (5)");
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
        System.out.println("please input directory path");
        String path = scanner.nextLine();
        System.out.println("please input file name ");
        String fileName = scanner.nextLine();
        System.out.println("please input content");
        String content = scanner.nextLine();
        File file = new File(path + File.separator + fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File is created");
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(content);
            bufferedWriter.close();
            System.out.println("File don't created");
        } catch (IOException e) {


        }

    }

}