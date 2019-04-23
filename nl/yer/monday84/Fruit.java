package nl.yer.monday84;

public class Fruit {

    // fields

    private String name;
    private int gewicht;
    private String kleur;


    //constructors


    public Fruit(String name){
        this.name = name;
    }





    // methodes

    public String toString(){
        return "Name:"+this.name+", gewicht:"+this.gewicht;
    }

    public String getName() {
        return name;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
}
