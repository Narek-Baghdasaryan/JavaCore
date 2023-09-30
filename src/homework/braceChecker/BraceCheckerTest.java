package homework.braceChecker;

public class BraceCheckerTest {
        public static void main(String[] args) {
            BraceChecker br =new BraceChecker("Hello [Wor}ld (404} qwert {(17]}");
            br.check();
        }

}
