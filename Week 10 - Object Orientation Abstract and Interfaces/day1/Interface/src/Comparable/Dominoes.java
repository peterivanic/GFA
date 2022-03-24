package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        List<Domino> dominoesSnake = new ArrayList<>();
        dominoesSnake.add(dominoes.get((int) (Math.random() * dominoes.size())));

        for (int i = 0; i < dominoes.size() - 1; i++) {
            for (Domino dominoe : dominoes) {
                if (dominoesSnake.get(i).getRightSide() == dominoe.getLeftSide()) {
                    dominoesSnake.add(dominoe);
                }
            }
        }
        System.out.println(dominoes);
        System.out.println(dominoesSnake);

        List<Domino> dominoesCompared = new ArrayList<>();
//        for (int i = 0; i < dominoes.size();i++) {
//            for (Domino d : dominoes) {
//                if(dominoes.get(i).compareTo(d) == -1){
//                    dominoesCompared.add(dominoes.get(i));
//                }
//            }
//        }
        Collections.sort(dominoes);
        System.out.println(dominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
