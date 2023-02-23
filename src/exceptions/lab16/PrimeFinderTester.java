package exceptions.lab16;

import Interface.Lab15.Player;

public class PrimeFinderTester {
    public static void main(String[] args) {
        try{
        PrimeFinder pf = new PrimeFinder(-2);
        pf.run();
            System.out.println(pf.prime);
    } catch (NegativeNumberException e){
            System.out.println("Podano ujemną liczbę " + e.getMessage());
        }
    }
}
