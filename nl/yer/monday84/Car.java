package nl.yer.monday84;
// doel: maak een static aan en gebruik hem in je main (CarApplication)

public class Car {

    public int km;

    public static int counter = 0;

    public void drive() {
        System.out.println("in de standaard");
        this.km++;
    }

    public void drive(double drive) {
        System.out.println("in de double");

        this.km += drive;
    }

    public void drive (int drive) {
        System.out.println("in de int");

        this.km += drive;
    }


    // constructor chaining zie onderstaand
    private int GEWICHT;
    private String nummerPlaat;
    private double kmStand;

    public Car() {
    }

    public Car(String nummerPlaat) {
        this(50);  //constructor chaining
        this.nummerPlaat = nummerPlaat;
    }

    public Car(double kmStand) {
        this(50);
        this.kmStand = kmStand;

    }

    public Car (int GEWICHT){
        this.GEWICHT = GEWICHT;
    }


    public String getnummerPlaat() {
        return nummerPlaat;
    }

    public void setnummerPlaat(String nummerPlaat) {
        nummerPlaat = nummerPlaat;
    }

    public double getkmStand() {
        return kmStand;
    }

    public void setkmStand(double kmStand) {
        kmStand = kmStand;
    }
}
