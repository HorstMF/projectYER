package nl.yer.Weekopdrachten.DiceRolling;

import java.util.Random;

public class DiceMain {
    public static void main(String[] args) {

        // zonder loop maar met objecten

        Dice dice1 = new Dice(); //nieuwe objecten maken, elke keer als die rolt
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();
        int sum = dice1.roll()+dice2.roll()+dice3.roll();

        System.out.println("eerste worp geeft: " + dice1.roll() + " tweede worp geeft: " +  dice2.roll() + " derde worp geeft: " + dice3.roll() + " het totaal is: " + sum);
        System.out.println(dice1.toString() + sum); //to string methode toegevoegd, zie class Dice


        //nu met een loop maar zonder methode roll
        //diceNumber is geinitaliseerd met een randomnr t/m 6 (+1 want 6 betekent excluded)
        //diceNumberReal variabele is aangemaakt om deze de waarden toe te kennen van de random number
        //sumStart = 0 zodat het erste getal hetzelfde blijft en vanaf daar komt de nieuwe sumStart erbij op

        Random r = new Random();
        int diceNumber = r.nextInt(6)+1;
        int diceNumberReal;
        int sumStart=0;
        for (int i=1 ; (i<4) ; i++){
            diceNumberReal = diceNumber;
            System.out.println("you rolled a: " + diceNumberReal);
            sumStart=sumStart+diceNumberReal;
            System.out.println(sumStart);
        }







    }
}
