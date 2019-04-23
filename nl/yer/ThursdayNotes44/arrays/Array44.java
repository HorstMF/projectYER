package nl.yer.ThursdayNotes44.arrays;
/* array: blokhaken
array is geen object, kan je niet overerven
mag arrays ongeinitailiseeerd laten, bij getallen is dat dichtbij 0, boolean false,
<NULL> - nullpointer, geheugen plek 0, gaat altijd mis
kunt geen rare stunts uithalen met array: telt vanaf 0, met stappen van 1, vaste lengte

twee manieren om een array te maken: met new string, of meteen intitaliseren (string getallen[]={"een", "twee", "drie",
"vier"];

Arrays.sort

ook examenstof: zoeken in de array, binairy search (ipv indexof). Binairy search, knipt hem door de helft, reeks
met getallen zodat je dan weet of je naar rechts of links moet gaan (groter of kleiner moet zoeken naar een bepaald
getal)

Binairy search, arrays sort, kan je getallen van array op goede volgorde zetten en verovlgens met binairy search
kan je een getal zoeken

enhanced forloop: geen getallen declareren maar items
maakt altijd een kopie

hoogste getal van een array bepalen: met een loop, bepalen welke positie? met enhanced loop kan dat niet. dat vertelt
die niet. alleen maar welk getal. zodra je index nodig hebt gebruik je dan normale forloop.

print-->
println --> print line
println zonder argumenten-->losse enter

int grootsteGetal = Integer.MIN_VALUE;
goeie manier is: int grootsteGetal = getallen[0]
system.out.print(het grootste getal in de array is : '")
for inti=1; i<getallen.length; i++

ArrayList namen = new ArrayLiset(); oneindig aantal wat je erin kan stoppen
ArrayList is iets wat je objecten in stopt dus een string herkent die niet

ArrayList<String> namen = new ArrayList<String>();  zet daar altijd wat neer, string/object/....altijd met die haken
namen.add("henk");
namen.add("Lies");
namen.add(LocalDate.now().toString());
etc.
for(String naam : namen){
systemprintln(naam+ " " + naam.length());
arraylist alles benaderen met methodes
length werkt niet --> .size()
namen.remove (0) --> verwijder henk of via object zelf namen.remove("Henk")

traditionale loop door arraylist
allemaal via functies want het is een class

alles in java heeft een tostring, een arraylist ook
printing namen bijv. zonder tostring kan ook, zal ook netjes namen naast elkaar printen

ieder object heeft equals and tostring
primitieven niet

Arraylist met getallen: <Integer> in de plaats van <string>
ArrayList <Integer> namen = new ArrayList <>();
namen.add(new Integer (2));
namne.add(2); autoboxing, maakt automatisch een primitieven van

 gebruik arraylist in geval van nood
 array is altijd beter te gebruiken maar niet altijd nodig
 en arraylist is altijd een array, met standaard 10 posities, verschuift hem steeds als je meer nodig hebt
 */

import java.util.Arrays;

public class Array44 {
    public static void main(String[] args) {


        String getallen[] = new String[5];
        Arrays.sort(getallen); //

    //binairy search+sort
        int getallen2[]={30, 50, 3, 8, 12, 100};
        Arrays.sort(getallen);
    int p=Arrays.binarySearch(getallen, 8);
    System.out.println(p);

    for(int i=0; i<getallen2.length; i++) {
        System.out.println(getallen2[i]);
    }
    }
}
