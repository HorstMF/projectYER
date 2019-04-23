package nl.yer.tuesday94;

public class Lion extends Mammal {
    //variabelen

    private int teeth;

    //constructors

    public Lion (String name) {
        super(name);
    }

    //methoden

    public void sound() { // override methode in Mammal
        super.sound();  //super. om sound van mammal mee te nemen
        System.out.println("Roar");
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    @Override
    public String toString() {
        return "Lion " +
                "teeth= " + teeth + super.toString();
    }
}
