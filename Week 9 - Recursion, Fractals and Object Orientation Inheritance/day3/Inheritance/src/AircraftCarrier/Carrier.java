package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {


    private List<Aircraft> aircrafts;
    public static int amountOfAmmo;
    private static int health;


    public Carrier(int amountOfAmmo, int health) {
        Carrier.amountOfAmmo = amountOfAmmo;
        Carrier.health = health;
        aircrafts = new ArrayList<>();
    }

    public void add(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public void fill() {
        int ammoToRefill = 0;
        for (Aircraft a : aircrafts) {
            ammoToRefill = ammoToRefill+ a.getMaxAmmo();
        }
        if (ammoToRefill < amountOfAmmo) {
            for (Aircraft a : aircrafts) {
                a.refillAmmo();
            }
        } else {
            for (Aircraft a : aircrafts) {
                if (a.isPriority()) {
                    if (amountOfAmmo > 0) {
                        a.refillAmmo();
                    }
                }
            }
        }
    }

    public void fight(Carrier carrier) {
        int allDamage = 0;
        for (Aircraft a : aircrafts) {
            allDamage += a.fight();
        }
        carrier.health -= allDamage;
    }

    public void getStatus(){
        int allDamage = 0;
        for (Aircraft a : aircrafts) {
            allDamage += a.baseDamage*a.ammoStorage;
        }
        if (health<=0){
            System.out.println("It's dead Jim :(");
        }else {
            System.out.println("HP: "+health+ ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + amountOfAmmo + ", Total damage: "+ allDamage);
            for (Aircraft a:aircrafts){
                System.out.println(a.getStatus());
            }
        }
    }


}
