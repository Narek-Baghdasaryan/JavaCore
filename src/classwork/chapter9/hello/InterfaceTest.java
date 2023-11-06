package classwork.chapter9.hello;

public class InterfaceTest {

    public static void main(String[] args) {
        ArmPerson armPerson = new ArmPerson();
        printHello(armPerson);
        EngPerson engPerson = new EngPerson();
        printHello(engPerson);
        RusPerson rusPerson = new RusPerson();
        printHello(rusPerson);
    }
    static void printHello(SayHello sayHello) {
        System.out.println(sayHello.sayHello());
    }
}
