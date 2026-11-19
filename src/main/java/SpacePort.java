public class SpacePort {

    public void launch(Soyuz soyuz) {
        if (soyuz.systemCheck()) {
            soyuz.launch();
        } else {
            System.out.println("Старт отменен");
        }
    }

    public void launch(DragonCargo dragonCargo) {
        if (dragonCargo.systemCheck()) {
            dragonCargo.launch();
        } else {
            System.out.println("Старт отменен");
        }
    }
}
