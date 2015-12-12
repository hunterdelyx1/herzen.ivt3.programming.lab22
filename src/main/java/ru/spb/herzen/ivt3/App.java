package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.*;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        RandomNameGenerator rand = new RandomNameGenerator(0); // 0 is random seed
        List<String> array = new ArrayList<String>();

        /* === Exercise 1 === */
        System.out.println("=== Zad 1 ===");
        for(int i=0; i<15; i++){
            String name = rand.next();
            array.add(name);
        }
        array.forEach(System.out::println);

        /* === Exercise 2 === */
        System.out.println("=== Zad 2 ===");
        array.stream().sorted().forEach(s -> System.out.println("Hello, " + s));

        /* === Exercise 3 === */
        System.out.println("=== Zad 3 ===");
        array.stream().filter(s -> array.indexOf(s) > 1).filter(s -> array.indexOf(s) < 5).forEach(s -> System.out.println("Hello, " + s));

        /* === Exercise 4 === */
        System.out.println("=== Zad 4 ===");
        array.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println("Hello, " + s));

        /* === Exercise 5 === */
        System.out.println("=== Zad 6 ===");
        List<Integer> num_array = new Random().ints(10, 0, 100).mapToObj(i -> new Integer(i)).collect(Collectors.toList());
        num_array.forEach(System.out::println);
        int count = (int) num_array.stream().filter(x -> x%2==0).count();
        System.out.println("Amount of even numbers: " + count);

        /* === Exercise 6 === */
        System.out.println("=== Zad 7 ===");
        String my_name = "Valentin";
        List<Character> char_array = my_name.chars().mapToObj(i -> new Character((char) i)).sorted((a,b)-> Character.toLowerCase(a)-Character.toLowerCase(b)).collect(Collectors.toList());
        char_array.forEach(System.out::println);

        /* === Exercise 7 === */
        System.out.println("=== Zad 8 ===");
        count = 0;
        String vowels_array= "aeiou";
        count = (int) my_name.chars().mapToObj(x -> Character.toLowerCase(x)).filter(i -> vowels_array.indexOf(i) != -1).count();
        System.out.println("Amount of different vowels: " + count);
    }
}