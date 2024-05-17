package ru.elektr0ni3561.task1;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");

        A obj1 = new A("title");

        System.out.println(obj1.getCoolString());
        System.out.println("------------------");

        B obj2 = new B("title obj1", 123);

        System.out.println(obj2.getCoolString("SUPER STRING"));
        System.out.println(obj2.getValue());

        obj2.setTitle("!NEW!");
        obj2.setValue(321);

        System.out.println(obj2.getCoolString());
        System.out.println("-------------------");

        A obj3 = new B("3 title", 3);

        System.out.println(obj3.getTitle());
        System.out.println(obj3.getID());
        System.out.println(obj3.getCoolString());
        System.out.println("-------------------");

        C obj4 = new C();

        System.out.println("var = " + obj4.var);

        obj4.var = 9;

        System.out.println("var = " + obj4.var);
        System.out.println("pi = " + C.pi);

        C.pi = 3.0f; // *_*

        System.out.println("pi = " + C.pi);
        System.out.println("---------------------------------------------------------");
    }
}