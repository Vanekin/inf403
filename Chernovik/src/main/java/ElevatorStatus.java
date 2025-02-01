// Перечисление состояний лифта
enum ElevatorStatus implements ElevatorState {
    NOT_WORKING("Не работает"),
    GOING_UP("Едет наверх"),
    GOING_DOWN("Едет вниз"),
    STANDING("Стоит");

    private final String description;

    ElevatorStatus(String description) {
        this.description = description;
    }

    @Override
    public String state() {
        return description;
    }
}
