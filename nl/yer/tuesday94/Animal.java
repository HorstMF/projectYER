package nl.yer.tuesday94;

public class Animal {

    //variablen

    private String name;
    private double weight;

    //constructors

    public Animal(){

    }

    public Animal(String name) {
        this.name = name;
    }

    //methoden

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    /*@Override
    public String toString() {   //erft van Class object daarom super.
        return super.toString();
    }

     */

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return " Animal " +
                "name= '" + name + '\'' +
                ", weight=" + weight +
                ' ';
    }
}
