package classwork.chapter10;

public class ThrowDemo {

    static void demoproc () {
        try {
            throw new NullPointerException("bruh");
        } catch (NullPointerException e) {
            System.out.println("bruhh" + "demoproc().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e){
            System.out.println("bruhhh" + " " + e);
        }
    }
}
