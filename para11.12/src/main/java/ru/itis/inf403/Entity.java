package ru.itis.inf403;

public class Entity {
    protected String name;
    protected int x;
    protected  int y;
    protected  static int fieldWidth;
    protected  static int fieldHeigth;

    public  Entity() {}

    public  Entity(String name) {
        this.name = name;
    }

    public  Entity(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return name + " (" + x + " , " + "y)";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move() {

    }

    public static void setFieldSize(int widht, int height) {
        fieldHeigth = height;
        fieldWidth = widht
    }
}
