public class Car {

    public String type;
    public String color;

    public Car() {
        int i = (int) (Math.random() * 5);
        switch (i) {
            case 0 -> type = String.valueOf(Types.SKODA);
            case 1 -> type = String.valueOf(Types.AUDI);
            case 2 -> type = String.valueOf(Types.BMW);
            case 3 -> type = String.valueOf(Types.LADA);
            case 4 -> type = String.valueOf(Types.KIA);
        }
        int j = (int) (Math.random() * 5);
        switch (j) {
            case 0 -> color = String.valueOf(Colors.RED);
            case 1 -> color = String.valueOf(Colors.BLACK);
            case 2 -> color = String.valueOf(Colors.BLUE);
            case 3 -> color = String.valueOf(Colors.GREEN);
            case 4 -> color = String.valueOf(Colors.GREY);
        }
    }
}
