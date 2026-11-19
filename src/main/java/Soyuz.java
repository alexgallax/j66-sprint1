public class Soyuz {

    private int crewSize;
    private double shipWeight = 7.2;

    public Soyuz() {}

    public Soyuz(int crewSize) {
        this.crewSize = crewSize;
    }

    public boolean systemCheck() {
        return crewSize > 0;
    }

    public void launch() {
        System.out.println("Союз стартовал");
    }
}
