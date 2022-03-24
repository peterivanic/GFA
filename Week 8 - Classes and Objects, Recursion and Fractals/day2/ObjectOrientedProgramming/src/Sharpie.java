public class Sharpie {
    public String color;
    public int widith;
    public int inkAmount = 100;

    public Sharpie(String color, int widith) {
        this.color = color;
        this.widith = widith;
    }

    public void use() {
        inkAmount -= 1;
    }

    public static void main(String[] args) {
        Sharpie firstSharpie = new Sharpie("brown", 30);
        Sharpie secondtSharpie = new Sharpie("red", 50);
        Sharpie thirdSharpie = new Sharpie("black", 20);

        for (int i = 0; i < 15; i++) {
            firstSharpie.use();
            secondtSharpie.use();
        }

        SharpieSet sharpieSet = new SharpieSet();
        sharpieSet.add(firstSharpie);
        sharpieSet.add(secondtSharpie);
        sharpieSet.add(thirdSharpie);

        System.out.println(sharpieSet.countUsable());

        for (int i = 0; i < 100; i++) {
            firstSharpie.use();
        }

        sharpieSet.removeTrash();
        System.out.println(sharpieSet.countUsable());
    }
}
