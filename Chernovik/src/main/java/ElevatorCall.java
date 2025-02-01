// Реализация вызова лифта
class ElevatorCall implements Call {
    private final boolean isStaff;
    private final int selectedFloor;

    public ElevatorCall(boolean isStaff, int destinationFloor) {
        this.isStaff = isStaff;
        this.selectedFloor = destinationFloor;
    }

    @Override
    public boolean isStaffCall() {
        return isStaff;
    }

    @Override
    public int getSelectedFloor() {
        return selectedFloor;
    }
}
