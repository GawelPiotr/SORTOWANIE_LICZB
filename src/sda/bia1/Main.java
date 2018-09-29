package sda.bia1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[20];

        for (int it = 0; it < numbers.length; it++) {
            numbers[it] = new Random().nextInt(30);
        }

        //Tools.print(numbers);

        Tools.print(args);


        System.out.println("Tablica bez sortowania");
        Tools.print(numbers);
        List<Integer> list = Arrays.asList(numbers);

        System.out.println("Lista bez sortowania odwrócona");
        Collections.reverse(Arrays.asList(numbers));
        Tools.print(list);

        System.out.println("Lista posortowana");
        Collections.sort(list);
        Tools.print(list);

        System.out.println("Lista posortowana odwrócona");
        Collections.reverse(list);
        Tools.print(list);


    }
}

/**
 * Napisz program sortujący wprowadzone liczby przez użytkownika [nie implementowalem tego, jest zamiast tego lowoanie]
 * a. Rosnąco
 * b. Malejąco
 * PS proszę wykorzystać metody dostępne w `Collections`
 */
