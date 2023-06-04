public class Main {

    /*public static String reverse(String b) {
        String wynik = "";
        for (int i = b.length()-1; i >= 0; i--) {
            wynik = wynik+b.charAt(i);

        }
        return wynik;*/

         public String rev(String tekst){
            StringBuilder wynik = new StringBuilder(tekst);
        wynik.reverse();
        return wynik.toString();
        }


    public static void main(String[] args) {

            Main n = new Main();
        System.out.println(n.rev("Daga"));

        String[] nazwiska = {
                "adam",
                "kamil",
                "Jan",
                "artur"
        };

        int[] oceny = {
                1,
                2,
                3,
                5
        };

        int suma = 0;

        for (int i = 0; i < oceny.length; i++) {
            suma = suma + oceny[i];
        }

        double avrage = (double) suma / oceny.length;

        for (int i = 0; i < nazwiska.length; i++) {
            System.out.println(i + 1 + " " + nazwiska[i] + " " + oceny[i]);
        }
        System.out.println(avrage);

        String a = "abc";


    }
}