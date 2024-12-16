package model;

public class Car {
    protected   String model;
    protected   int enginePower;
    protected   int speed;
    protected   int yearOfIssue;

    public Car (String model, int enginePower, int speed, int yearOfIssue) {
        this.model = model;
        this.enginePower = enginePower;
        this.speed = speed;
        this.yearOfIssue = yearOfIssue;
    }

    public String toString() {
        return model + " мощность двигателя - " + enginePower + " лошадинных сил" + "  скорость - " + speed + "  год выпуска - " + yearOfIssue;
    }



    public void brake(int speed) {
        speed -= 10;
    }

    public void acceleration(int speed) {
        speed += 10;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
