package lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MonteChristo {


    List<String> loadTextFile(String textFileName) {
        try {
            return Files.readAllLines(Paths.get(textFileName));
        } catch (IOException e) {
            System.out.println("coś poszło nie tak przy wczytywaniu pliku " + e.getMessage());
        }
        return null;
    }

    void showAllLines(List<String> allLines) {
        for (String line : allLines) {
            System.out.println(line);
        }
    }

    int countLines(List allLines) {
        return allLines.size();
    }

    void showEveryHundredLines(List<String> allLines) {
        System.out.println();
        for (int i = 0; i < allLines.size(); i++) {
            if(i%100 == 0 ){
                System.out.println(i + " " + allLines.get(i));
            }
        }
    }

    void showTheLongestVers (List<String> allLines){
        String longestLines = "";

        for (String line: allLines) {
            if (line.length() > longestLines.length()){
                longestLines = line;
            }
        }
        System.out.println("Najdłuższy wiersz w ksiązce " + longestLines.length() + "znaki/znaków  -  " + longestLines.toUpperCase());
    }


    public static void main(String[] args) {

        MonteChristo mc = new MonteChristo();
        List<String> allLines = mc.loadTextFile("src/java.mmiklas.wszib.edu.pl_dodatki_crsto10.txt");

        //mc.showAllLines(allLines);

        System.out.println("Wczytywany plik zawiera " + mc.countLines(allLines) + " lini ");
       // mc.showEveryHundredLines(allLines);

        mc.showTheLongestVers(allLines);
    }



}
