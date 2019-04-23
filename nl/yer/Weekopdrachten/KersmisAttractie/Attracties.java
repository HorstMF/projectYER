package nl.yer.Weekopdrachten.KersmisAttractie;

public class Attracties {

    //variabelen

    private double price;
    private double omzet = 0.00;
    private String name;
    private int aantalRitten = 0;
    private int hoeveelRondjes;
    private int roundsBeforeInspection = 10;
    private int defect;

    // constructor aangemaakt met naam en prijs en max aantal ritten totdat die defect is
    //printline met name en prijs

    public Attracties(String name, double price, int defect) {
        this.name = name;
        this.price = price;
        this.defect = defect;
        System.out.println("De attractie heet: " + name + " en een ritje kost: " + price);
    }

    //methodes


    public void draaien(int hoeveelRondjes) { //kan je invullen hoeveel ritjes je wilt
        int rit;
        for (rit = 1; rit < hoeveelRondjes + 1; rit++) {
            aantalRitten++;
            omzet = rit * price;
            System.out.println(name + " heeft gedraaid " + aantalRitten);
            System.out.println(" omzet is " + omzet);
        }
    }

    public void perform() { //als je in loop zet telt die winst op en hoeveel ritten gemaakt t/m limiet aantalritten defect
        if(aantalRitten<defect) {
            aantalRitten++;
            omzet = aantalRitten * price;
            System.out.println(name + " heeft gedraaid " + aantalRitten + " de omzet is: " + omzet);
        }
        else{
            System.out.println("De attractie is helaas defect");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getOmzet() {
        return omzet;
    }

    public void setOmzet(double omzet) {
        this.omzet = omzet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAantalRitten() {
        return aantalRitten;
    }

    public void setAantalRitten(int aantalRitten) {
        this.aantalRitten = aantalRitten;
    }

    public int getHoeveelRondjes() {
        return hoeveelRondjes;
    }

    public void setHoeveelRondjes(int hoeveelRondjes) {
        this.hoeveelRondjes = hoeveelRondjes;
    }

    public int getRoundsBeforeInspection() {
        return roundsBeforeInspection;
    }

    public void setRoundsBeforeInspection(int roundsBeforeInspection) {
        this.roundsBeforeInspection = roundsBeforeInspection;
    }

    public int getDefect() {
        return defect;
    }

    public void setDefect(int defect) {
        this.defect = defect;
    }

    public void perform1() { //als je in loop zet telt die winst op en hoeveel ritten gemaakt t/m limiet aantalritten defect
        if (aantalRitten < defect) {
            aantalRitten++;
            omzet = aantalRitten * price;
            System.out.println(name + " heeft gedraaid " + aantalRitten + " de omzet is: " + omzet);
        } else {
            System.out.println("De attractie is helaas defect");
        }
    }

    public void inspectie() {
        if (aantalRitten < roundsBeforeInspection) {
            draaien(hoeveelRondjes);
            System.out.println(name + ": nog geen inspectie nodig :)");
        } else {
            draaien(hoeveelRondjes);
            System.out.println("stop met draaien! " + name + " heeft inspectie nodig!!");
        }
    }
}