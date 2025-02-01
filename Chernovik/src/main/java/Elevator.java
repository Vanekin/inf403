// Абстрактный класс лифта
abstract class Elevator {
    protected ElevatorStatus status;
    protected int currentFloor;
    protected Integer selectedFloor;

    public Elevator() {
        this.status = ElevatorStatus.STANDING;
        this.currentFloor = 1; // Начальный этаж
        this.selectedFloor = null;
    }

    public abstract boolean canServeCall(Call call);

    public ElevatorStatus getStatus() {
        return status;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setSelectedFloor(Integer selectedFloor) {
        this.selectedFloor = selectedFloor;
    }

    public void move() {
        if (status == ElevatorStatus.GOING_UP) {
            currentFloor++;
        } else if (status == ElevatorStatus.GOING_DOWN) {
            currentFloor--;
        }
    }
}
