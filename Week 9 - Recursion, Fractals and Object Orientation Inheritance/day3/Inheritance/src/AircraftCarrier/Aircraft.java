package AircraftCarrier;

public class Aircraft {

    public boolean priority;
    public int maxAmmo;
    public int baseDamage;
    public int ammoStorage;

    public int fight() {
        int damage = baseDamage * ammoStorage;
        ammoStorage = 0;
        return damage;
    }

    public void refillAmmo() {
        ammoStorage = maxAmmo;
        Carrier.amountOfAmmo = Carrier.amountOfAmmo - maxAmmo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public boolean isPriority() {
        return priority;
    }

    public String getStatus() {
        return "";
    }

}
