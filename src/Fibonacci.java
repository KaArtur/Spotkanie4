public class Fibonacci {

    static public long fibonacci(long liczba) {
        if (liczba == 1 || liczba == 2) {
            return 1;
        }
        return fibonacci(liczba - 1) + fibonacci(liczba - 2);
    }

    public static void main(String[] args) {

        System.out.println(fibonacci(15));

    }


}
