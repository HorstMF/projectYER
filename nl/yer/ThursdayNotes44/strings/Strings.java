package nl.yer.ThursdayNotes44.strings;
/*
string: tekenreeks van tekens, wordt op apart stukje geheugen opgeslagen omdat het anders de volgende primitieven
kan overschrijven. krijgt een reference die verwijst naar dat stukje geheugen, bijv. 1000.
primitieven: int, wordt opgeslagen op byte, blijft zo. boolean opslaan, maakt niet uit op welk adres, is wel vast omvang
kenmerken primitieven: constante geheugenomvang,
Java heeft tussenweg gevonden in optellen van strings; strings moeten objecten zijn: Java.lang.String;
strings zijn immutable = object kan eigenschappen niet meer veranderen, daarmee hebben ze probleem met geheugen opgelost

garbage collector ontdekt gelukkig snel dat overbodige aangemaakte strings worden opgeruimd. Bijv. via een loop elke
keer een a of b erbij (nieuwe string elke keer).

Stringbuilder is een mutuable string - die kan je wel veranderen, gebruik je in uitzonderlijke gevallen, gebruik je niet
als standaard string. meeste strings zijn constanten, die veranderen helemaal niet, dat zijn er maar een paar.
moet ik nou als ik twee strings aa nelkaar wil plakken een stringbuilder bouwen?
onder water maakt er al stiekemn een stringbuilder van. Alleen met hle ingewikkelde dingen moet je een builder maken,
zodat de compiler het nog kan zien.

Java maak je enorm veel objecten aan. Dus strings als object geeft geen probleem.

Eigenaardige van strings is dat ze zich gedragen als primitieven.

String is geen array. heeft geen vaste grootte, dus heel logisch dat dat niet kan, dan kan je niet met [] benaderen

wat voor character geen charAt terug: een character; is mutuable, kan je veranderen.

charat
index
replace
lowercase uppercase
trim

\n = enter
\t = tab

 */


public class Strings {
    public static void main(String arg[]) {
        int t = 1234;
        String hoi = new String ("Hello World of Java \n\n");
        //hoi = hoi.toUpperCase();
        //hoi = hoi.toLowerCase();
        //hoi = hoi.replace('o', '0'); //tussen 1 aanhaling: primitieve ipv string, ivm geheugen
        //hoi=hoi.trim(); //haalt onnodige char weg, bijv. 2 enters zoals nu \n\n


        /*hello is 5 bytes lang, wat nou als die groeit? zie bovenstaand
        ziet eruit als een constante. Maakt wel nieuwe string aan, blijft eigenaardig. Het zijn objecten, daarom
        heeft het een hoofdletter, Class. Het is eigennaardig want je kan bijv. achterplakken zoals onderstaande
        "world", met constanten kan dat niet, optellen bijv. Incl onderstaande staan hier nu 3 strings,
        hello, world, hello world
        wat ook eigennaardig is: je kan bijv. een int t = 1234 aanmaken, en dit kan je optellen in de print*/

        System.out.println(hoi+"world"+t);
        System.out.println(hoi.length());
        System.out.println(hoi.charAt(1));
        /*als je niet zeker bent dat die bijv. 10 kan hebben, dan moet je gebruik
        maken van ifjes zie onderstaand
        if (hoi.length(>=11)) {
            System.out.println(hoi.charAt(10)); */

        System.out.println(hoi.indexOf('o')); //op plaats 5
        System.out.println(hoi.length());


        String hoi_uitgebreid = hoi.substring(0,4)+" to the "+hoi.substring(5); //hell to the
        System.out.println(hoi_uitgebreid);

        System.out.println(hoi.contains("Python"));

        String naam1 = "Henk"; //je bent hier niet namen aan het vergelijken maar posities, staat bijv. op 1012
        String naam2 = "Henk"; //java denkt, deze hebben we al, op 1012 staan namelijk
        if (naam1==naam2) {
            System.out.println("Namen zijn hetzelfde");
        } else {
            System.out.println("Namen zijn niet hetzelfde");
        }// hier komt het 'juiste'antwoord uit, maar is niet juist want vergleijkt niet de namen

        //naam1= henk, naam2=hen naam2=naam2+k

        if(naam1.equals(naam2)==true) { //elk object heeft een equals functie
            System.out.println("namen zijn hetzelfde");
        } else {
            System.out.println("namen zijn niet htezelfde");
        }

    }}
