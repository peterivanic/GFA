import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    public static List<Sharpie> listOfSharpies = new ArrayList<>();
    public static List<Sharpie> listOfUsableSharpies = new ArrayList<>();

    public SharpieSet() {
    }

    public void add(Sharpie sharpie) {
        listOfSharpies.add(sharpie);
    }

    public int countUsable() {
        int count = 0;
        for (Sharpie sharpie : listOfSharpies) {
            if (sharpie.inkAmount > 0){
                count++;
            }
        }
        return count;
    }

    public void removeTrash(){
        for (Sharpie sharpie : listOfSharpies) {
            if (sharpie.inkAmount != 0) {
                listOfUsableSharpies.add(sharpie);
            }
        }
        listOfSharpies = listOfUsableSharpies;
    }


}
