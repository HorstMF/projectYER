package nl.yer.ThursdayNotes44.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
//4. Bingo (multidimensionale arrays)
//Een bingokaart heeft de volgende eigenschappen:
//– Het is een kaart met 5 bij 5 vakjes met in elk vakje een getal (behalve in het midden)
//– De eerste kolom bevat 5 willekeurige getallen uit de reeks 1 t/m 15
//– De tweede kolom bevat 5 willekeurige getallen uit de reeks 16 t/m 30
//– De derde kolom bevat 5 willekeurige getallen uit de reeks 31 t/m 45, maar het middelste vakje is
//leeg.
//– De vierde kolom bevat 5 willekeurige getallen uit de reeks 46 t/m 60
//– De vijfde kolom bevat 5 willekeurige getallen uit de reeks 61 t/m 75
//– De getallen worden niet gesorteerd in de kolommen
//– Elk getal komt maximaal één maal voor op de kaart
//Schijf een programma dat een willekeurige bingokaart genereert en vervolgens op het scherm zet.
//Zet de bingokaart in het computergeheugen als een array met 25 integers. Het middelste vakje (met
//index 12) bevat het getal 0 om aan te geven dat het leeg is.

public class BingoKaart {


    int[][] bingokaart = new int[5][5];
    int rows = bingokaart.length;
    int columns = bingokaart[0].length;

    //for random values between bounds: see below method kaart
    // For example, to pick a number from 5 to 35 inclusively, the upper limit number will be 35-5+1=31 and 5 needs to be added to the result:
    Random randomValue = new Random();
    //int[][] gevuldeBingokaart = new int[5][5];
    //int[][] gevuld

    public void kaartTrekken() {
        System.out.println("Dit is je bingokaart: ");
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                switch (j) {
                    case 0:
                        bingokaart[i][j] = randomValue.nextInt(16);
                        break;
                    case 1:
                        bingokaart[i][j] = randomValue.nextInt(15) + 16;
                        break;
                    case 2:
                        if (i == 2) {
                            bingokaart[i][j] = 0;
                        } else {
                            bingokaart[i][j] = randomValue.nextInt(15) + 31;
                        }
                        break;
                    case 3:
                        bingokaart[i][j] = randomValue.nextInt(15) + 46;
                        break;
                    case 4:
                        bingokaart[i][j] = randomValue.nextInt(15) + 61;
                        break;
                }
                //bingokaart[i][j] = gevuldeBingokaart[5][5];
                //System.out.print(gevuldeBingokaart + " ");
                System.out.print(bingokaart[i][j] + " " );
            }
            System.out.println();
        }
        //newRandomNr();
        System.out.println();

    }

    /*public void newRandomNr() {
        do {
            //else do nothing
            if (gevuldeBingokaart[0][1] == gevuldeBingokaart[0][2] | gevuldeBingokaart[0][1] == gevuldeBingokaart[0][3] | gevuldeBingokaart[0][1] == gevuldeBingokaart[0][4] | gevuldeBingokaart[0][2] == gevuldeBingokaart[0][3] | gevuldeBingokaart[0][2] == gevuldeBingokaart[0][4] | gevuldeBingokaart[0][3] == gevuldeBingokaart[0][4]) {
                randomValue.nextInt(16);
            }
        }
        while (gevuldeBingokaart[0][1] == gevuldeBingokaart[0][2] | gevuldeBingokaart[0][1] == gevuldeBingokaart[0][3] | gevuldeBingokaart[0][1] == gevuldeBingokaart[0][4] | gevuldeBingokaart[0][2] == gevuldeBingokaart[0][3] | gevuldeBingokaart[0][2] == gevuldeBingokaart[0][4] | gevuldeBingokaart[0][3] == gevuldeBingokaart[0][4]);
    }

     */

}

