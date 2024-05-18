package ru.elektr0ni3561.homework1;

public class A {

    {
        System.out.println("A not static init");
        ID = 5;
    }

    private final int ID;

    private String title = "";

    public A() {
    }

    public A(String title) {
        this.title = title;
    }

    public String getCoolString() {
        return "My cool string is \"" + title + " here!\"";
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
