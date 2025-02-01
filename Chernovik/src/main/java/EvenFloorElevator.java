// Лифт для четных этажей
class EvenFloorElevator extends Elevator {
    @Override
    public boolean canServeCall(Call call) {
        return call.getSelectedFloor() % 2 == 0;
    }
}
