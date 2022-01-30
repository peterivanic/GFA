package Garden;

public class Flower {

    private final String name;
    private double water;
    boolean needsWater;

    public Flower(String name) {
        this.name = name;
        this.water = 0;
    }

    public boolean isNeedsWater() {
        if (water < 5) {
            needsWater = true;
            return true;
        } else {
            needsWater = false;
            return false;
        }
    }

    public void info() {
        if (water < 5) {
            System.out.println("The " + name + " Flower needs water.");
        } else {
            System.out.println("The " + name + " Flower doesnt need water.");
        }
    }

    public void watering(double amountOfWater) {
        if (water < 5) {
            double absorb = amountOfWater / 4 * 3;
            this.water = water + absorb;
        }
    }
}
