package AircraftCarrier;

public class F35 extends Aircraft {

    private static boolean priority = true;

    public F35() {
        super.ammoStorage = 0;
        super.maxAmmo = 12;
        super.baseDamage = 50;
        priority = true;
    }

    public String getType() {
        return "F35";
    }

    public String getStatus() {
        return "Type F35 " + ", Ammo: " + ammoStorage + ", Base Damage: " + baseDamage + ", All Damage: " + baseDamage * maxAmmo;
    }

    public boolean isPriority() {
        return priority;
    }

    @Override
    public void refillAmmo() {
        ammoStorage = maxAmmo;
        Carrier.amountOfAmmo = Carrier.amountOfAmmo - maxAmmo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public int fight() {
        int damage = baseDamage * ammoStorage;
        ammoStorage = 0;
        return damage;
    }
}
