package nl.yer.Weekopdrachten.KersmisAttractie;

import java.util.ArrayList;

public class KermisAttractie {
    public static void main(String[] args) {

        //String[] attractie = {"Pocahontas", "Ariel", "Dumbo", "Alladin", "Belle"};



        Attracties a = new Attracties("Pocahontas", 2.50, 15);
        Attracties b = new Attracties("Ariel", 1.50, 20);
        Attracties c = new Attracties("Dumbo", 3.00,10);
        Attracties d = new Attracties("Aladin", 2.65, 12);
        Attracties e = new Attracties("Belle", 1.95, 8);

        for(int i=0; i<1; i++){
            a.perform();
            b.perform();
            c.perform();
            d.perform();
            e.perform();
            double totaleOmzet = a.getOmzet()+b.getOmzet()+c.getOmzet()+d.getOmzet()+e.getOmzet();
            System.out.println(totaleOmzet);
        }







    }





    }
