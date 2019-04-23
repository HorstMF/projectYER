package nl.yer.Friday54;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
/*LocalTime tijd = LocalTime.now();
        System.out.println(tijd);

        /*LocalDate datum1 = LocalDate.now();
        System.out.println(datum1.getDayOfMonth()+ "-" + datum1.getMonthValue() + "-"+datum1.getYear());

        /*LocalDate datum2 = LocalDate.of(1994, 12, 1); //of gebruik je het meeste
        System.out.println(datum2.getDayOfMonth()+ "-" + datum2.getMonthValue() + "-"+datum2.getYear());
        System.out.println(datum2.getDayOfWeek());

        /*LocalDate datum3 = LocalDate.now(); //rekenen met data, datum vna vandaag staat hier
        datum3.plusDays(7000);
        System.out.println(datum3);

         */
        /* LocalDate datum = LocalDate.now();
        LocalTime tijd = LocalTime.of(18,0,0);
        LocalDateTime ldt = LocalDateTime.of(datum,   tijd);

        System.out.println("datum en tijd: " + ldt);

         */

public class DateTime {
    public static void main(String[] args) {

        // jave oefeningen met Datum en tijd:
        LocalDate datum = LocalDate.now();

        // 1a print het huidige jaartal:
        System.out.println("huidige jaartal is: "+ datum.getYear());

        //1b print de naam van de dag van vandaag:
        System.out.println("dag van de week is: "+ datum.getDayOfWeek());

        //1c datum van morgen (volgende dag dus):
        System.out.println("morgen is het: " + datum.plusDays(1));

        //1d print of het momenteel ochtend, middag, avond of nacht is:
        System.out.println("Het is momenteel: " +
                new String[]{"nacht", "ochtend", "middag", "avond"}[ LocalTime.now().getHour()/6 ]+ "/n");

        /*door niks tussen de blokhaken te zetten, geef je gewoon een rijtje waardes. dit is ter plekke een array
        maken en handig in dit geval.
        kan ook: String[] dagdalen = {"nacht", "ochtend", "middag", "avond"};
        system.out.println(dagdelen[ LocalTime.now().getHour()/6 ]

         */

        //1e print hoe laat over 2.5 uur
        LocalTime t = LocalTime.now();
        System.out.println("de tijd over 2.5 uur is: "+ t.plusMinutes(150));
        System.out.println("de tijd nu is: " + t);















    }
}
