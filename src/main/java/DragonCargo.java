public class DragonCargo {

    private double shiwWeight = 4.0;
    private double maxCargoWeight = 6.0;
    private double cargoWeight;

    public DragonCargo(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public boolean systemCheck() {
        return cargoWeight <= maxCargoWeight;
    }

    public void launch() {
        System.out.println("Dragon Cargo стартовал");
    }
}
