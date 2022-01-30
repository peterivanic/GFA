package Garden;

public class Tree {
    private final String name;
    private double water;
    boolean needsWater;

    public Tree(String name) {
        this.name = name;
        this.water = 0;
    }

    public boolean isNeedsWater() {
        if (water < 10) {
            needsWater = true;
            return true;
        } else {
            needsWater = false;
            return false;
        }
    }

    public void info() {
        if (water < 10) {
            System.out.println("The " + name + " Tree needs water.");
        } else {
            System.out.println("The " + name + " Tree doesnt need water.");
        }
    }

    public void watering(double amountOfWater) {
        if (water < 10) {
            double absorb = amountOfWater / 10 * 4;
            this.water = water + absorb;
        }
    }
}
