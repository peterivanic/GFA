import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            Car c = new Car();
            cars.add(c);
        }
        int skodaCount = 0;
        int audiCount = 0;
        int ladaCount = 0;
        int bmwCount = 0;
        int kiaCount = 0;

        int blackCount = 0;
        int redCount = 0;
        int greenCount = 0;
        int blueCount = 0;
        int greyCount = 0;

        for (Car c : cars) {
            switch (c.color) {
                case "BLACK" -> blackCount++;
                case "BLUE" -> blueCount++;
                case "RED" -> redCount++;
                case "GREEN" -> greenCount++;
                case "GREY" -> greyCount++;
            }
            switch (c.type) {
                case "SKODA" -> skodaCount++;
                case "BMW" -> bmwCount++;
                case "AUDI" -> audiCount++;
                case "LADA" -> ladaCount++;
                case "KIA" -> kiaCount++;
            }
        }

        HashMap<String,Integer> carsCount = new HashMap<>();
        carsCount.put("SKODA",skodaCount);
        carsCount.put("AUDI",audiCount);
        carsCount.put("BMW",bmwCount);
        carsCount.put("LADA",ladaCount);
        carsCount.put("KIA",kiaCount);

        System.out.println("SKODA : " + skodaCount);
        System.out.println("AUDI : " + audiCount);
        System.out.println("BMW : " + bmwCount);
        System.out.println("LADA : " + ladaCount);
        System.out.println("KIA : " + kiaCount);
        System.out.println();

        System.out.println("BLACK : " + blackCount);
        System.out.println("BLUE : " + blueCount);
        System.out.println("RED : " + redCount);
        System.out.println("GREEN : " + greenCount);
        System.out.println("GREY : " + greyCount);



    }
}
