package exceptions.lab16;

import java.util.Scanner;

public class SqrtCalc {
    public static void main(String[] args) throws IllegalAccessException {

        Scanner scanner = new Scanner(System.in);
        double d = 0;
        System.out.println("Podaj liczbę: ");

        try {
            d = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Błąd! Podana wartość nie jest liczbą");
            System.exit(-1);
        } finally {
            System.out.println("Koniec");
        }

        if (d < 0) {
            throw new IllegalAccessException();
        }
        System.out.println(Math.sqrt(d));

    }
}
