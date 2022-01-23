public class Station {

    public int gasAmount ;
    public int gas ;

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refill(Car car) {
        if (car.capacity - car.gasAmount >= 0) {
            gas = car.capacity - car.gasAmount;
        }
        for (int i = 0; i < gas; i++) {
            if (car.gasAmount <= car.capacity && gasAmount > 0) {
                car.gasAmount++;
                gasAmount--;
            }
        }
    }
}
