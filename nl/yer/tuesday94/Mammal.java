package nl.yer.tuesday94;

public class Mammal extends Animal { //vergeet niet de extend

    //variabelen

    private boolean fur;

    //constructors

    public Mammal(String name) {
        super(name);
    }

    //methoden

    public void sound() {
        System.out.println("mammalSound");
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    @Override
    public String toString() {
        return "Mammal " +
                "fur= " + fur + super.toString();
    }
}
