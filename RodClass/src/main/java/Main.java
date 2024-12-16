import model.*;

public class Main {
    public static void main(String[] args) {
        SportSedan bmwM5F90 = new SportSedan("BMW M5 F90", 440, 0, 2021, 496, false );
        bmwM5F90.acceleration(bmwM5F90.getSpeed());
        bmwM5F90.acceleration(bmwM5F90.getSpeed());
        bmwM5F90.brake(bmwM5F90.getSpeed());
        bmwM5F90.hatchOpen(bmwM5F90.isHatch());
        System.out.println(bmwM5F90.toString());

        LongSedan ladaAura = new LongSedan("Lada Aura", 125, 0, 2024, 500, true);
        ladaAura.acceleration(ladaAura.getSpeed());
        ladaAura.hatchClose(ladaAura.isHatch());
        System.out.println(ladaAura.toString());

        Suv chevroletTahoe = new Suv("Chevrolet Tahoe", 364, 0, 2006, true, 32);
        chevroletTahoe.suspensionUp(chevroletTahoe.getHeightSuspension());
        chevroletTahoe.suspensionUp(chevroletTahoe.getHeightSuspension());
        chevroletTahoe.acceleration(chevroletTahoe.getSpeed());
        System.out.println(chevroletTahoe.toString());

        Universal ladaKalina = new Universal("Lada Kalina", 114, 0, 2012, 210, false);
        ladaKalina.acceleration(ladaKalina.getSpeed());
        ladaKalina.unfold(ladaKalina.getBackSeat());
        System.out.println(ladaKalina.toString());



    }
}
