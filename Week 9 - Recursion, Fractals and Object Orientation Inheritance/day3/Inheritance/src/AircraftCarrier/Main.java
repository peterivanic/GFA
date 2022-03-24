package AircraftCarrier;

public class Main {

    public static void main(String[] args) {
        Carrier myCarrier = new Carrier(50,3000);
        F16 f16a = new F16();
        F16 f16b = new F16();
        F35 f35a = new F35();
        F35 f35b = new F35();
        F35 f35c = new F35();
        myCarrier.add(f16a);
        myCarrier.add(f16b);
        myCarrier.add(f35a);
        myCarrier.add(f35b);
        myCarrier.add(f35c);

        myCarrier.getStatus();
        myCarrier.fill();
        System.out.println();
        myCarrier.getStatus();

        Carrier otherCarrier = new Carrier(2000,3000);

        System.out.println();
        otherCarrier.getStatus();

        myCarrier.fight(otherCarrier);
        System.out.println();
        otherCarrier.getStatus();

     }
}
