import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Farm {
    public List <Animal> listOfAnimals = new ArrayList<>();
    public int limit;

    public Farm(int limit) {
        this.limit = limit;
    }

    public void breed(){
        if (limit>listOfAnimals.size()){
            Animal newAnimal = new Animal();
            listOfAnimals.add(newAnimal);
        }
    }

    public void sell(){
        Comparator<Animal> animalComparator = (o1, o2) -> {
            int hunger1 = o1.hunger;
            int hunger2 = o2.hunger;
            return hunger1 - hunger2;
        };
        listOfAnimals.sort(animalComparator);
        listOfAnimals.remove(0);
    }
}
