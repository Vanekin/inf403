// Лифт для сотрудников
class StaffElevator extends Elevator {
    @Override
    public boolean canServeCall(Call call) {
        return call.isStaffCall();
    }
}
