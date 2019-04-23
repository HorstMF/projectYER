package nl.yer.Monday1504.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GarderobeMain {

    public static void main(String[] args) {

        Garderobe x = new Garderobe();
        int pietsJas = x.enter("Nike");
        int henksJas = x.enter("Adidas");
        int jansJas = x.enter("Reebok");


        System.out.println("piets jas is " + x.leave(1));
        System.out.println("henks jas is " + x.leave(2));

        System.out.println("Jans jas is " + x.leave(jansJas));









    }
}
