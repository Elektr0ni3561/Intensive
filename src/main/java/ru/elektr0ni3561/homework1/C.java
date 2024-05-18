package ru.elektr0ni3561.homework1;

public class C {

    static {
        pi = 3.1415f;
    }

    static public float pi;

    int var = 0;

    private boolean flag = true;

    public C() {
    }

    public C(int var) {
        this.var = var;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }
}
