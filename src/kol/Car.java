package kol;

import java.util.Objects;
import java.util.Random;

public class Car {

    /*Zaimplementuj klasę Car, przechowującą takie informacje o samochodzie jak brand, color, year. Stwórz 100 różnych egzemplarzy samochodów z losowo wybranymi parametram wg słowników:

    String[] brands = {"Suzuki", "Mazda", "Toyota"}
    String[] colors  = {"white", "silver", "black"};
    int[] years = {2020, 2021, 2022};

    Czy samochód 1 oraz 100 mają te same parametry?*/


    private String brand;
    private String color;
    private int year;

    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        String[] brands = {"Suzuki", "Mazda", "Toyota"};
        String[] colors  = {"white", "silver", "black"};
        int[] years = {2020, 2021, 2022};

        Random rand = new Random();

        Car[] cars = new Car[100];
        for (int i = 0; i < 100; i++) {
            String brand = brands[rand.nextInt(brands.length)];
            String color = colors[rand.nextInt(colors.length)];
            int year = years[rand.nextInt(years.length)];
            cars[i] = new Car(brand, color, year);
        }



        for (Car a:cars
             ) {
            System.out.println(cars);
        }
        System.out.println(cars[1]);
        System.out.println(cars[0].equals(cars[99]));
    }
}
