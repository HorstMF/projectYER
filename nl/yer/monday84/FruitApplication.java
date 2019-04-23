package nl.yer.monday84;

import java.sql.SQLOutput;

public class FruitApplication {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Appel");
        f1.setGewicht(125);
        f1.setKleur("Rood");

        System.out.println(f1.getName());
        System.out.println(f1.getGewicht());
        System.out.println(f1.getKleur());

        Fruit f2 = new Fruit("Peer");
        f2.setGewicht(150);
        f2.setKleur("Groen");
        System.out.println(f2.getName());
        System.out.println(f2.getGewicht());
        System.out.println(f2.getKleur());

        System.out.println(f2);

        Trein t = new Trein(); // dit kan omdat de class bestaat, zie hieronder
    }
}


class Trein {

}