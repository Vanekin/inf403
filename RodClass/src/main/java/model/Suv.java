package model;

public class Suv extends Car {
    protected boolean ramma;
    protected int heightSuspension;
    public Suv (String model, int enginePower, int speed, int yearOfIssue, boolean ramma, int heightSuspension) {
        super(model, enginePower, speed, yearOfIssue);
        this.ramma = ramma;
        this.heightSuspension = heightSuspension;
    }

    public int getHeightSuspension() {
        return heightSuspension;
    }

    public void setHeightSuspension(int heightSuspension) {
        this.heightSuspension = heightSuspension;
    }

    public void setRamma(boolean ramma) {
        this.ramma = ramma;
    }

    public boolean getRamma() {
        return  ramma;
    }

    @Override
    public void brake(int speed) {
        speed -= 2;
    }

    public void acceleration(int speed) {
        speed += 3;
    }

    public void suspensionUp(int heightSuspension) {
        heightSuspension += 2;
    }

    public  void suspensionDown(int heightSuspension) {
        heightSuspension -= 2;
    }

    public String toString() {
        return model + " мощность двигателя - " + enginePower + " лошадинных сил" + "  скорость - " + speed + "  год выпуска - " + yearOfIssue + "  рамма - " + ramma + "  высота подвески - " + heightSuspension;
    }
}
