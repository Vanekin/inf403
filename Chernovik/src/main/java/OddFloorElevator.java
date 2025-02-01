// Лифт для нечетных этажей
class OddFloorElevator extends Elevator {
    @Override
    public boolean canServeCall(Call call) {
        return call.getSelectedFloor() % 2 != 0;
    }
}
