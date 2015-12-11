package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.lang.reflect.Array;
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

        for(String tmp : array){
            System.out.println("Hello, " + tmp);
        }


        /* === Exercise 2 === */
        System.out.println("=== Zad 2 ===");
        Collections.sort(array);
        for(String tmp : array){
            System.out.println("Hello, " + tmp);
        }


        /* === Exercise 3 === */
        System.out.println("=== Zad 3 ===");
        for(int i=2; i<5; i++){
            System.out.println("Hello, " + array.get(i));
        }


        /* === Exercise 4 === */
        System.out.println("=== Zad 4 ===");
        for(int i=0; i<15; i++){
            array.set(i, array.get(i).toUpperCase());
        }

        for(String tmp : array){
            System.out.println("Hello, " + tmp);
        }

        /* === Exercise 5 === */
        System.out.println("=== Zad 5 ===");
        for(int i=0; i<15; i++){
            array.set(i, array.get(i).toUpperCase());
        }

        for(String tmp : array){
            System.out.println("Hello, " + tmp);
        }

        /* === Exercise 6 === */
        System.out.println("=== Zad 6 ===");
        List<Integer> num_array = new ArrayList<Integer>();

        for(int i=0; i<15; i++){
            num_array.add((int) Math.floor(Math.random() * 201));
        }
        int count = 0;
        for(Integer tmp : num_array){
            if(tmp%2==0){
                count++;
            }
            System.out.println(tmp);
        }
        System.out.println("Amount of even numbers: " + count);

        /* === Exercise 7 === */
        System.out.println("=== Zad 7 ===");
        String my_name = "Valentin";
        List<Character> char_array = my_name.chars().mapToObj(i -> new Character((char) i)).sorted().collect(Collectors.toList());
        char_array.forEach(System.out::println);

        /* === Exercise 8 === */
        System.out.println("=== Zad 8 ===");
        count = 0;
        String vowels_array= "AEIOUaeiou";
        count = (int) my_name.chars().mapToObj(i -> new Character((char) i)).filter(i -> vowels_array.indexOf(i) != -1).count();
        System.out.println("Amount of different vowels: " + count);
    }
}