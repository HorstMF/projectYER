package nl.yer.Wednesday104;

public class GarbageCollector {

    int gc;
    String name;

    public GarbageCollector(int gc, String name) {
        GarbageCollector x = new GarbageCollector(5, "gekke gc");
    }



    public static void main(String[] args) {



        System.gc();

    }


public class Finalizer{
    protected void finalize() {
        System.out.println("Finalizing");

    }


}}
