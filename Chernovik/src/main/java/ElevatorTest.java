public class ElevatorTest {
    public static void main(String[] args) {
        ElevatorSystem elevatorSystem = new ElevatorSystem();

        for (int i = 0; i < 3; i++) {
            elevatorSystem.addElevator(new EvenFloorElevator());
            elevatorSystem.addElevator(new OddFloorElevator());
        }
        elevatorSystem.addElevator(new StaffElevator());

        elevatorSystem.runSimulation();
    }
}
