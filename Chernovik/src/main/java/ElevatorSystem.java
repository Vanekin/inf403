import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Класс, описывающий работы лифтов
class ElevatorSystem {
    private final List<Elevator> elevators;
    private final Random random;

    public ElevatorSystem() {
        elevators = new ArrayList<>();
        random = new Random();
    }

    public void addElevator(Elevator elevator) {
        elevators.add(elevator);
    }

    public void runSimulation() {
        for (int i = 0; i < 10000; i++) {
            if (i % 20 == 0) {
                int floor = random.nextInt(16) + 1; // Генерация случайного этажа от 1 до 16
                Call call = new ElevatorCall(floor % 2 == 0, floor); // Четный или нечетный
                try {
                    handleCall(call);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            // Движение лифтов
            for (Elevator elevator : elevators) {
                elevator.move();
            }
        }
    }

    private void handleCall(Call call) throws Exception {
        for (Elevator elevator : elevators) {
            if (elevator.canServeCall(call) && elevator.getStatus() == ElevatorStatus.STANDING) {
                elevator.setSelectedFloor(call.getSelectedFloor());
                elevator.status = call.isStaffCall() ? ElevatorStatus.GOING_UP : ElevatorStatus.GOING_DOWN;
                return;
            }
        }
        for (Elevator elevator : elevators) {
            if (elevator instanceof OddFloorElevator) {
                throw new Exception("Все лифты для вызова на чётные этажи заняты или неисправны " + call.getSelectedFloor());
            }else if (elevator instanceof EvenFloorElevator) {
                throw new Exception("Все лифты для вызова на нечётные этажи заняты или неисправны " + call.getSelectedFloor());
            }else throw new Exception("Все лифты для персонала заняты или неисправны " + call.getSelectedFloor());
        }
        //throw new Exception("Все лифты заняты или неисправны для вызова на этаж " + call.getSelectedFloor());
    }
}
