package Lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class PlanetLambda {
    public static void main(String[] args) {
        String[] planets = {"Słońce", "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};

       // System.out.println("rower".charAt("rower".length()-1) - "mata".charAt("mata".length()-1));



      /*  Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));  // sortowanie po alfabecie

*/
        Arrays.sort(planets, (o1, o2) -> o1.charAt(o1.length()-1) - o2.charAt(o2.length()-1));

        Arrays.asList(planets).forEach(s-> System.out.println(s));


    }
}
