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

        for (int i = 0; i < 15; i++) {
            firstSharpie.use();
            secondtSharpie.use();
        }

        System.out.println(firstSharpie.inkAmount + " " + secondtSharpie.inkAmount);
    }
}
