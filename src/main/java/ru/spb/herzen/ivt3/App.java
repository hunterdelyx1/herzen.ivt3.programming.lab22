package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        RandomNameGenerator rand = new RandomNameGenerator(0); // 0 is random seed

        String[] array = new String[15];

        /* === Exercise 1 === */
        System.out.println("=== Zad 1 ===");
        for(int i=0; i<15; i++){
            String name = rand.next();
            array[i] = name;
        }
        for(String tmp : array){
            System.out.println("Hello, " + tmp);
        }


        /* === Exercise 2 === */
        System.out.println("=== Zad 2 ===");
        Arrays.sort(array);
        for(String tmp : array){
            System.out.println("Hello, " + tmp);
        }


        /* === Exercise 3 === */
        System.out.println("=== Zad 3 ===");
        for(int i=2; i<5; i++){
            System.out.println("Hello, " + array[i]);
        }


        /* === Exercise 4 === */
        System.out.println("=== Zad 4 ===");
        for(int i=0; i<15; i++){
            array[i] = array[i].toUpperCase();
        }
        for(int i=0; i<15; i++){
            System.out.println("Hello, " + array[i]);
        }


        /* === Exercise 5 === */
        System.out.println("=== Zad 5 ===");
        for(int i=0; i<15; i++){
            array[i] = array[i].toUpperCase();
        }
        for(int i=0; i<15; i++){
            System.out.println("Hello, " + array[i]);
        }

        /* === Exercise 6 === */
        System.out.println("=== Zad 6 ===");
        int[] num_array = new int[30];

        for(int i=0; i<15; i++){
            String name = rand.next();
            num_array[i] = (int) Math.floor(Math.random()*201);
        }
        int count = 0;
        for(int i=0; i<15; i++){
            if(num_array[i]%2==0){
                count++;
            }
            System.out.println(i + " : " + num_array[i]);
        }
        System.out.println("Amount of even numbers: " + count);


        /* === Exercise 7 === */
        System.out.println("=== Zad 7 ===");
        String my_name = "Valentin";
        char[] char_array = my_name.toCharArray();
        Arrays.sort(char_array);
        for(char x : char_array){
            System.out.println(x);
        }

        /* === Exercise 8 === */
        System.out.println("=== Zad 8 ===");
        count = 0;
        char[] vowels_array= {'A','E','I','O','U','a','e','i','o','u'};
        char tmp_char='\0';
        for(char x : char_array){
            if(Arrays.binarySearch(vowels_array, x)>0){
                if(x!=tmp_char) {
                    tmp_char = x;
                    count++;
                }
            }
        }
        System.out.println("Amount of different vowels: "+count);
    }
}