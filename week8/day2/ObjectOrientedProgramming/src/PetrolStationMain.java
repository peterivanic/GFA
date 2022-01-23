public class PetrolStationMain {

    public static void main(String[] args) {
        Station station = new Station(120);
        Car car = new Car(100, 0);
        Car car1 = new Car(100,50);

        System.out.println(car.gasAmount);
        System.out.println(car1.gasAmount);
        System.out.println(station.gasAmount);
        station.refill(car);
        station.refill(car1);
        System.out.println(car.gasAmount);
        System.out.println(car1.gasAmount);
        System.out.println(station.gasAmount);
    }
}
