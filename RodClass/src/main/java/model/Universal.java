package model;

public class Universal extends Car {
    protected int trunkVolume;
    protected boolean backSeat; //положение заднего сидения(сложено - False, раздоженно - True)
    public Universal (String model, int enginePower, int speed, int yearOfIssue, int trunkVolume, boolean backSeat) {
        super(model, enginePower, speed, yearOfIssue);
        this.trunkVolume = trunkVolume;
        this.backSeat = backSeat;
    }

    public boolean getBackSeat() {
        return backSeat;
    }

    public void setBackSeat(boolean backSeat) {
        backSeat = backSeat;
    }

    public void fold(boolean backSeat) {
        backSeat = false;
    }

    public void unfold(boolean backSeat) {
        backSeat = true;
    }


    public int getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    @Override
    public void brake(int speed) {
        speed -= 7;
    }

    public void acceleration(int speed) {
        speed += 12;
    }

    public String toString() {
        return model + " мощность двигателя - " + enginePower + " лошадинных сил" + "  скорость - " + speed + "  год выпуска - " + yearOfIssue + "  объём багажника - " + trunkVolume + "  положение сидения - " + backSeat;
    }
}
