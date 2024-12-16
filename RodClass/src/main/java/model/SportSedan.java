package model;

public class SportSedan extends Sedan {
    public SportSedan (String model, int enginePower, int speed, int yearOfIssue, int length, boolean hatch) {
        super(model, enginePower, speed, yearOfIssue, length, hatch);
    }
    @Override
    public void brake(int speed) {
        speed -= 15;
    }

    public void acceleration(int speed) {
        speed += 20;
    }
}
