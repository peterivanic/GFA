package AircraftCarrier;

public class F16 extends Aircraft{


    private static boolean priority = false;

    public F16() {
        super.ammoStorage = 0;
        super.maxAmmo = 8;
        super.baseDamage = 30;
    }

    public String getType(){
        return "F16";
    }

    public String getStatus(){
        return "Type F16 " + ", Ammo: " + ammoStorage + ", Base Damage: " + baseDamage + ", All Damage: "+baseDamage*maxAmmo;
    }

    public boolean isPriority(){
        return priority;
    }

    @Override
    public void refillAmmo(){
        ammoStorage = ammoStorage + maxAmmo;
        Carrier.amountOfAmmo = Carrier.amountOfAmmo - maxAmmo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }
    public int fight(){
        int damage = baseDamage * ammoStorage;
        ammoStorage = 0;
        return damage;
    }
}
