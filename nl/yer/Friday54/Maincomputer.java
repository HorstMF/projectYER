package nl.yer.Friday54;

public class Maincomputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.setCputype(3);
        computer1.setMemorysize(8);
        System.out.println(computer1.calculatePrice());
        Computer computer2 = new Computer();
        computer2.setCputype(7);
        computer2.setMemorysize(16);

        System.out.println(computer2.calculatePrice());

    }
}
