package nl.yer.Wednesday104;

class Application {

    public static void main(String[] args) {

        ExceptionPetrolTank t = new ExceptionPetrolTank(4, 40);

        try { //kan meerdere catches onderstaan (van klein naar groot)
            t.fill(204);
        } catch (ExceptionTankFull m) {
            m.printStackTrace();
            System.out.println("tank is vol");
        } finally {
            System.out.println("Einde tankbeurt!");

            System.out.println(t.getCurrentLevel());
        }

        ExceptionPetrolTank x = new ExceptionPetrolTank(50, "Brand x");
        ExceptionPetrolTank y = new ExceptionPetrolTank(50, "Brand x");

        if (x.equals(y)) {
            System.out.println("De brands zijn gelijk");
        } else {
            System.out.println("De brands zijn ongelijk");
        }


    }
}


