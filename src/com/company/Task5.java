package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Task5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please input the first three numbers of your bank account");
        BufferedReader TD = new BufferedReader(new InputStreamReader(System.in));
        String digits = TD.readLine();
        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        try (BufferedReader tj = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            System.out.println("Searching ...");
            while ((line = tj.readLine()) != null) {
//                System.out.println(line);
                // Putting Data into an array
                String[] words = line.split("\\t+");
                String bankNumberDzumbunu56874 = words[0].trim();
                String bankNameDzumbunu56874 = words[1].trim();
                if (bankNumberDzumbunu56874.equals(digits)) {
                    System.out.println("Done ");
                    System.out.println("Bank Digits : " + bankNumberDzumbunu56874 + "\nBank Name : " + bankNameDzumbunu56874);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Information Loading Failed");
        }
    }
}
