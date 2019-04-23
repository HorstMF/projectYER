package nl.yer.monday84;

public class CarApplication {
    public static void main(String[] args) {
        Car Audi = new Car(300.0);
        Car BMW = new Car(); //aanroep van constructor



        System.out.println(Car.counter);

        Audi.drive(1.5); //pakt automatisch double (see car.java - 3x aangegeven) blz192
        System.out.println(Audi.km);
        Audi.drive(3); // pakt automatisch int
        System.out.println(Audi.km);
        Audi.drive(); //
        System.out.println(Audi.km);

        Car Toyota = new Car("AAFFKK"); //zie Car.java constructors aangemaakt voor NummerPlaat & KM

        System.out.println("Nummerplaat is: " + Toyota.getnummerPlaat() + " & km stand is: " + Toyota.getkmStand());









    }
}
