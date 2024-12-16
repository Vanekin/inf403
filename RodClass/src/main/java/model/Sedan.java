package model;

public class Sedan extends Car {
    protected int length;
    protected boolean hatch;
    public Sedan(String model, int enginePower, int speed, int yearOfIssue, int length, boolean hatch) {
        super(model, enginePower, speed, yearOfIssue);
        this.length = length;
        this.hatch = hatch;
    }

    public boolean isHatch() {
        return hatch;
    }

    public void setHatch(boolean hatch) {
        this.hatch = hatch;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void brake(int speed) {
        super.brake(speed);
    }

    public void acceleration(int speed) {
        super.acceleration(speed);
    }

    public void hatchOpen(boolean hatch) {
        hatch = true;
    }

    public void hatchClose(boolean hatch) {
        hatch = false;
    }

    @Override
    public String toString() {
        return model + " мощность двигателя - " + enginePower + " лошадинных сил" + "  скорость - " + speed + "  год выпуска - " + yearOfIssue + "  длина кузова - " + length + "  положение люка - " + hatch;
    }
}
