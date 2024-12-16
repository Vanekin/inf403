package model;

public class LongSedan extends Sedan {
    public LongSedan (String model, int enginePower, int speed, int yearOfIssue, int length, boolean hatch) {
        super(model, enginePower, speed, yearOfIssue, length, hatch);
    }

    @Override
    public void brake(int speed) {
        speed -= 7;
    }

    public void acceleration(int speed) {
        speed += 7;
    }

}
