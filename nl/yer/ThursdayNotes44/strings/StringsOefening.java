package nl.yer.ThursdayNotes44.strings;
//oefeningen met Strings

import java.util.Scanner;

public class StringsOefening {
    public static void main(String[] args) {

        /*
        String tekst = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        //1a print de lengte van de string
        System.out.println("lengte van de string: " + tekst.length() + '\n');

        //1b print de 5 letter van de string
        System.out.println("5e letter van de string: " + tekst.charAt(4) + "\n");

        //1c string in hoofdletters
        System.out.println("string in hoofdletters: " + tekst.toUpperCase() + "\n");

        //1d de eerste 12 letters van de string
        System.out.println("eerste 12 letters: " + tekst.substring(0, 12) + "\n");

        //1e op welke positie staat het woord dolore
        System.out.println("dolore staat op de positie: " + tekst.indexOf("dolore"));

        //1f print hoe vaak de letter m in de string staat (case-sensitive):

        tekst.toLowerCase();
        int total = 0;
        int letter;
        for (letter = 0; letter < tekst.length(); letter++) {
            if (tekst.charAt(letter) == 'm') {
                total = total + 1;
            }
        }
        System.out.println("de letter m komt voor: " + total + "\n");

         */


        // opdracht 2. tekstinvoer

        Scanner input = new Scanner(System.in);
        System.out.print("Voer een tekst in: ");
        String text = input.nextLine();
        //print lengte string
        System.out.println('\n' + "lengte van je tekst: " + text.length() + '\n');

        //print 5e letter string
        if (text.length() > 4) {
            System.out.println("5e letter van de string is: " + text.charAt(4) + "\n");
        } else {
            System.out.println("5e letter van je tekst is niet aanwezig" + "\n");
        }

        //print de string in hoofdletters
        System.out.println("je tekst in hoofdletters: " + text.toUpperCase() + "\n");

        /*//de eerste 12 letters van de string - eigenlijk klopt dit niet ivm spaties
        int lengte = text.length();
        if (lengte > 11) {
            System.out.println("eerste 12 letters: " + text.substring(0, 12) + "\n");
        } else {
            System.out.println("je tekst is korter dan 12 letters" + "\n");
        }

         */

        // welke positie staat dolore
        String ik = "ik";
        if (text.contains(ik)) {
            System.out.println("het woord 'ik' staat op plek " + text.indexOf(ik));
        } else {
            System.out.println(" ☺ \n ");
        }

        // hoe vaak wordt de letter 'e' gebruikt
        int total1 = 0;
        int letter1;
        for (letter1 = 0; letter1 < text.length(); letter1++) {
            if (text.charAt(letter1) == 'e') {
                total1 = total1 + 1;
            }
        }
        System.out.println("de letter e komt voor: " + total1 + "\n");

        // 3. klinkers tellen: geef aantal klinkers in de tekst

        Scanner input1 = new Scanner(System.in);
        System.out.print("Voer een tekst in: ");
        String invoer = input1.nextLine();

        int totaal = 0;
        for (int i = 0; i < invoer.length(); i++) {
            char letter = invoer.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == ' ') {
                totaal++;
            }
        }
        System.out.println("Aantal klinkers in je tekst: " + totaal);


    }
}


