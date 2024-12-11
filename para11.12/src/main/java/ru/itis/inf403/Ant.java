package ru.itis.inf403;

public class Ant extends Entity {
    public  Ant() {}

    public Ant(int x, int y) {
        super("Муравей", x, y);
    }

    @Override
    public void move() {
        int direction = (int) (Math.random() * 5);
    }
}
