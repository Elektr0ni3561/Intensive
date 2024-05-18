package ru.elektr0ni3561.homework1;

public class B extends A {

    static {
        System.out.println("B static init");
        CONST = System.currentTimeMillis();
    }

    {
        System.out.println("B not static init");
        value = 42;
    }


    final static public long CONST;

    private int value;

    public B() {
        super();
    }

    public B(int value) {
        super();
        this.value = value;
    }

    public B(String title) {
        super(title);
    }

    public B(String title, int value) {
        super(title);
        this.value = value;
    }

    @Override
    public String getCoolString() {
        return "B have cool string for you: " + super.getTitle() + value + " :)";
    }

    public String getCoolString(String s) {
        return "B have cool string for you: " + s + value + " :)";
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
