package Garden;

import java.util.ArrayList;
import java.util.List;

public class GardenMain {

    static List<Flower> flowers;
    static List<Tree> trees;

    public GardenMain() {
        flowers = new ArrayList<>();
        trees = new ArrayList<>();
    }

    public void info() {
        for (Flower f : flowers) {
            f.info();
        }
        for (Tree t : trees) {
            t.info();
        }
    }

    public void wateringPlants(int amountOfWater) {
        System.out.println("Watering with " + amountOfWater);
        int count = 0;
        for (Flower f : flowers) {
            if (f.isNeedsWater()) {
                count++;
            }
        }
        for (Tree t : trees) {
            if (t.isNeedsWater()) {
                count++;
            }
        }
        double water = (double) amountOfWater / count;
        for (Flower f : flowers) {
            if (f.needsWater) {
                f.watering(water);
            }
        }
        for (Tree t : trees) {
            if (t.needsWater) {
                t.watering(water);
            }
        }
    }

    public static void main(String[] args) {
        Flower blue = new Flower("blue");
        Flower yellow = new Flower("yellow");
        Tree purple = new Tree("purple");
        Tree orange = new Tree("orange");
        GardenMain garden = new GardenMain();

        flowers.add(blue);
        flowers.add(yellow);
        trees.add(purple);
        trees.add(orange);

        garden.info();
        System.out.println();

        garden.wateringPlants(40);
        garden.info();
        System.out.println();

        garden.wateringPlants(70);
        garden.info();
    }


}
