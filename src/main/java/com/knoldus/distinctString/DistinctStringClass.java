package main.java.com.knoldus.distinctString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctStringClass {
    /**
     * @param stringList
     * @return
     */
    public static List<String> getDistinctStrings(List<String> stringList) {

        // Here  lambda expression to implementing required tasks.
        Function<List<String>, List<String>> distinctStrings =
                string -> string.stream().distinct().sorted()
                        .collect(Collectors.toList());      // collecting as a list
        return distinctStrings.apply(stringList);
    }
    /**
     *
     * @param arguments
     */
    public static void main(String[] arguments) {
        List<String> list = new ArrayList<>();
        System.out.println("Type words in single line using space and press enter");
        Scanner string_input = new Scanner(System.in);
        String line1 = string_input.nextLine();

        String[] stringList3 = line1.split("\\s");
        Collections.addAll(list, stringList3);

        System.out.println("Distinct Values are given here :- " + DistinctStringClass
                .getDistinctStrings(list));
    }
}
