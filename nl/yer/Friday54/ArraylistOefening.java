package nl.yer.Friday54;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArraylistOefening {

    public static void main(String[] args) {

        //Oefening 1 ArrayList basis

        ArrayList<Integer> getallen = new ArrayList<>();
        getallen.add(new Integer(10));
        getallen.add(new Integer(5));
        getallen.add(new Integer(2));
        getallen.add(new Integer(0));
        //1.b
        System.out.println(getallen);

        //1.c
        getallen.set(1,15);
        System.out.println("Het tweede getal is vervangen" + getallen + "\n");

        //1.d
        getallen.add(2,10);
        System.out.println("Op de derde positie staat nu: " + getallen + "\n");

        //1.e
        getallen.remove(3);
        System.out.println("Het vierde getal is verwijderd: " + getallen + "\n");

        //1.f
        System.out.println("Print de getallen uit de ArrayList op de console: "+ getallen + "\n");

        //1.g zet getal 25 op willekeurige positie in de arraylist
        Random rand = new Random(); //slechts 1 x nodig
        getallen.add( rand.nextInt(getallen.size()) , 25);
        System.out.println("Getal 25 is op een willekeurige positie gezet: " + getallen + "\n");

        //1.h verwijder het getal 25 weer, gaat dit probleemloos?

        getallen.remove(new Integer(25)); // verwijdert de eerste 25, dus niet per se de random toegevoegde.
        System.out.println("Het getal 25 is weer verwijderd: " + getallen + "\n");

        //middels for loop: elke 25 verwijderd die dan in de array (dus ook niet alleen de willekeurige 25)
        int i;
        for(i=0; i<getallen.size();i++) {
            i = 25;
            getallen.remove(new Integer(25));
            System.out.println("Het getal 25 is hier ook verwijderd: "+ getallen + "\n");
            }

        //Oefening 2 Array vs ArrayList: maak 1,2,3 van Java oefeningen Arrays, gebruik ArrayList ipv arrays

        ArrayList<String> leesPlankje = new ArrayList<>();
        leesPlankje.add("raam");
        leesPlankje.add("roos");
        leesPlankje.add("neef");
        leesPlankje.add("fik");
        leesPlankje.add("gat");
        leesPlankje.add("wiel");
        leesPlankje.add("zes");
        leesPlankje.add("juk");
        leesPlankje.add("schop");





        }

    }
