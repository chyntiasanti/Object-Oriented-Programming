public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        // Implement the destruction logic here
        System.out.println("Barrier destroyed!");
    }

    public String getBarrierInfo() {
        return "Barrier Strength: " + strength;
    }
}