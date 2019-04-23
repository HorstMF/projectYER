package nl.yer.Friday54;
/*
Class: Main:

Class: MyClass:
functie
public: acces modifier
final/static
returntype (int)
naam
argumenten
 */

//
public class Computer {
    //variabelen altijd private maken, niet public en als je niks doet is default en dat wil je ook niet
    //enum Cputype { i3, i5, i7 }; kan je gebruiken, moet je hieronder aanpassen maar het kan allebei behouden worden
    private int cputype; //geen static hier gebruiken
    private int memorysize;

    public static final int PRICE_PER_GB = 25; //constanten alijd klassenniveau, want je wilt niet als object


    public void setMemorysize(int memorysize) {
        this.memorysize = memorysize;
    }

    public void setCputype(int cputype) { //lokale cputype zet zichzelf
        this.cputype = cputype; //versie uit het object zetten, setter, schrijf het met set, hoofdletter naam variable
    }

    public int getCputype() {
        return cputype;
    }

    public int getMemorysize() {
        return memorysize;
    }



    int calculatePrice() {
        int price = 0;
        switch(cputype) {
            case 3:
                price = 500;
                break;
            case 5:
                price = 600;
                break;
            case 7:
                price = 700;
                break;
            default:
                System.out.println("Invalid CPU");
                // exception!!!!!!!! krijgen we later
        }
        price+=25*memorysize;
        return price;

        }
    }

