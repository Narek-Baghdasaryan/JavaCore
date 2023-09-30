package homework.braceChecker;
public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    private Stack stack = new Stack();
    private int index;

    public void check() {
        for (int index = 0; index < text.length(); index++) {
            char symbol = text.charAt(index);
            switch (symbol) {
                case '[':
                case '{':
                case '(':
                    stack.push(symbol);
                    break;
                case ']':
                case '}':
                case ')':
                    if (stack.getSize() == -1) {
                        System.err.println("closed" + text.charAt(index) + "but not opened");
                    } else {
                        char pop = (char) stack.pop();
                        if (symbol == ']' && pop != '[' || symbol == '}' && pop != '{' || symbol == ')' && pop != '(') {
                            System.err.println("opened" + pop + "but closed" + symbol + "index is" + (index));
                        }
                    }
            }

        }
        int stacksize = stack.getSize();
        for (int i = 0; i <= stacksize; i++) {
            System.err.println("opened" + (char) stack.pop() + "not closed");

        }
    }
}