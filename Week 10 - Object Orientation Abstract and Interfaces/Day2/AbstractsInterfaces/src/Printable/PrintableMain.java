package Printable;

import java.util.ArrayList;
import java.util.List;

public class PrintableMain {

    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<>();
        List<Todo> todos = new ArrayList<>();

        dominoes.add(new Domino(3,2));
        dominoes.add(new Domino(2,5));
        dominoes.add(new Domino(1,2));
        dominoes.add(new Domino(5,3));

        todos.add(new Todo("Buy milk","high",false));
        todos.add(new Todo("Clean car","low",false));
        todos.add(new Todo("Learn java","very high",false));

        for (Domino d : dominoes) {
            d.printAllFields();
        }

        System.out.println();
        for (Todo t : todos) {
            t.printAllFields();
        }

    }
}
