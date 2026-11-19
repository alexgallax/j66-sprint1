public class Main {

    public static void main(String[] args) {
        Soyuz soyuz1 = new Soyuz();
        Soyuz soyuz2 = new Soyuz(3);

        DragonCargo dragonCargo = new DragonCargo(4.5);

        SpacePort spacePort = new SpacePort();

        System.out.println("Первый");
        spacePort.launch(soyuz1);
        System.out.println("Второй");
        spacePort.launch(soyuz2);

        System.out.println("Dragon Cargo");
        spacePort.launch(dragonCargo);
    }
}
