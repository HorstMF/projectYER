package nl.yer.ThursdayNotes44.strings;

public class main {
    /*
    static final int ROOD = 1; //dit heeft nadelen, want wat als je een negatief getal invult, dat kan
    static final int WIT = 2; //dit is chaos, men kan kleuren eigen codes geven, raak je door de war
    static final int BLAUW = 3;
    */

    //enum is zelf gedefineerd type die waardes kan hebben

    enum Kleur {ROOD, WIT, BLAUW, GEEL, ZWART}

    /*constanten daarboven worden dan overbodig (daarom multi line gegegevn)
    die kleuren tussen haakjse staan voor objecten, en dus is het een reference type, enum is stiekem een class
    je moet altijd met hoofdletter schrijven
     */

    Kleur kleur = Kleur.BLAUW; //is geen literal maar een referentie
    //enums kan je constructors aan toevoegen en veel meer, heel complex

    /* literal = constante, bijv. hello world bij een string, of een getal voor int
    final = mag maar 1 waarde hebben, dus geen default bijv. erbij
     */

    public static void main(String args[]) {
        String hoi = "Hallo"; //literal

        System.out.println(hoi); //geen literal
        int t = 123; //literal
        boolean g = true; //geen literal

        Kleur kleur = Kleur.BLAUW;
        switch(kleur) { //dit mag omdat het een final is, of het moet een literal zijn
            case ROOD:
                System.out.println("ROOD");
                break;
            default:

        }


    }
}
