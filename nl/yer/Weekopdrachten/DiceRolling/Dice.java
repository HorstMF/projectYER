package nl.yer.Weekopdrachten.DiceRolling;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;


public class Dice {

    //fields: creer een variabele (hier: rollEmBaby) en geef een waarde van 1 t/m 6

    Random r = new Random();
    int diceNumber = r.nextInt(6)+1;


    //constructors

    public Dice() { //deze constructor wordt altijd aangemaakt, default constructor

    }

    // methods:
    //method roll output: random numbers
    public int roll() {
        return diceNumber;
    }

    public String toString() {
        return "dobbelsteen getal is: " + diceNumber + " en het totaal is: " ;
    }
}
