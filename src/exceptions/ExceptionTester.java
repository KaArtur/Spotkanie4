package exceptions;

public class ExceptionTester {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};


        System.out.println("start");
        try {
            System.out.println("Nasz nr to " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nie ma takiego indexu");
        }

        System.out.println("koniec");
    }
}
