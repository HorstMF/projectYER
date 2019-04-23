package nl.yer.ThursdayNotes44.arrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;


public class ArrayOefening {

    //array met woorden
    public static void main(String[] args) {
        // maak een array aan van de woorden
        String[] leesPlankje = {"raam", "roos", "neef", "fik", "gat", "wiel", "zes", "juk", "schop", "voet", "neus", "muur", "bijl", "hok", "duif", "eieren"};

        //print de woorden op alfabetische volgorde
        Arrays.sort(leesPlankje);
        for (String woord : leesPlankje) {   //enhanced forloop: (datatype name : collection of objects)
            System.out.println("de array bevat dit woord: " + woord + ",");
        }

        //print alle woorden met lengte van exact 3 letters

        for (int i = 0; i < leesPlankje.length; i++) {
            char[] letternumber = leesPlankje[i].toCharArray();
            if (letternumber.length == 3) {
                System.out.print("dit zijn 3-letter woorden: ");
                System.out.println(letternumber);
            }
        }

        //Print alle woorden die beginnen met de letter r op de console
        for (int i = 0; i < leesPlankje.length; i++) {
            if (leesPlankje[i].startsWith("r")) {
                System.out.println("deze woorden beginnen met de letter r: " + leesPlankje[i]);

            }
        }

        //Print het langste woord op de console
        String langste = leesPlankje[0];
        for (int i = 0; i < leesPlankje.length; i++) {
            if (langste.length() < leesPlankje[i].length()) {
                langste = leesPlankje[i];
                System.out.println("langste is: " + langste);
            }
        }


        //Print alle woorden die 2 klinkers bevatten op het scherm
        // klopt niet moet nog uitzoeken hoe

        char klinker1 = 'a';
        char klinker2 = 'e';
        char klinker3 = 'o';
        char klinker4 = 'u';
        char klinker5 = 'i';
        int totaal = 0;
        for (int i = 0; i < leesPlankje.length; i++) {
            int klinker=0;
            char[] letternumber = leesPlankje[i].toCharArray();
            for(int z=0; z<letternumber.length;z++)
            if (letternumber[z] == klinker5) {
                    klinker++;
            }else {
                System.out.println("geen klinker");
            }

        }


        //a. Zet de namen Lucas, Luuk, Max, Thomas, Bram, Julia, Sophie, Mila, Eva en Lotte in een array

        String [] namen={"Lucas", "Luuk", "Max", "Thomas", "Bram", "Julia", "Sophie", "Mila", "Eva", "Lotte"};

        //b. Zet de namen op alfabetische volgorde op het scherm

        Arrays.sort(namen);
        for(String naam : namen) {
            System.out.println(naam + " ");
        }

        //De volgende code genereert een willekeurig getal tussen 0 en 50 (non-inclusive):
        //Random rand = new Random(); // Slechts één keer nodig
        //int value = rand.nextInt(50);
        //c. Kies een willekeurige naam en zet deze op het scherm
        String random = (namen[new Random().nextInt(namen.length)]);
        System.out.println("een random naam: " + random);


        //d. Kies drie willekeurige namen en zet deze op het scherm. Een naam mag niet dubbel gekozen
        //worden.
        String random1 = (namen[new Random().nextInt(namen.length)]);
        String random2 = (namen[new Random().nextInt(namen.length)]);
        String random3 = (namen[new Random().nextInt(namen.length)]);


        //4. Bingo (multidimensionale arrays)
        //Een bingokaart heeft de volgende eigenschappen:
        //– Het is een kaart met 5 bij 5 vakjes met in elk vakje een getal (behalve in het midden)
        //– De eerste kolom bevat 5 willekeurige getallen uit de reeks 1 t/m 15
        //– De tweede kolom bevat 5 willekeurige getallen uit de reeks 16 t/m 30
        //– De derde kolom bevat 5 willekeurige getallen uit de reeks 31 t/m 45, maar het middelste vakje is
        //leeg.
        //– De vierde kolom bevat 5 willekeurige getallen uit de reeks 46 t/m 60
        //– De vijfde kolom bevat 5 willekeurige getallen uit de reeks 61 t/m 75
        //– De getallen worden niet gesorteerd in de kolommen
        //– Elk getal komt maximaal één maal voor op de kaart
        //Schijf een programma dat een willekeurige bingokaart genereert en vervolgens op het scherm zet.
        //Zet de bingokaart in het computergeheugen als een array met 25 integers. Het middelste vakje (met
        //index 12) bevat het getal 0 om aan te geven dat het leeg is.





        int[][] bingokaart = new int[5][5];
        Random eersteKolom = new Random();
        int value = eersteKolom.nextInt(15);


    }
}
















