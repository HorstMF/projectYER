package nl.yer.Monday1504.Map;

import java.util.HashMap;
import java.util.Map;

public class Garderobe {


    private Map<Integer, String> wardrobe = new HashMap<>();

    private int laatstVerstrekteJasnummer;
    private String jasMerk;

    public int enter(String jasMerk) {
        laatstVerstrekteJasnummer++;
         wardrobe.put(laatstVerstrekteJasnummer, jasMerk);
        return laatstVerstrekteJasnummer;
    }

    public String leave(int laatstVerstrekteJasnummer) {
        return wardrobe.get(laatstVerstrekteJasnummer);
    }

    public Map<Integer, String> getGarderobeKlanten() {
        return wardrobe;
    }

    public void setGarderobeKlanten(Map<Integer, String> garderobeKlanten) {
        this.wardrobe = garderobeKlanten;
    }

    public int getLaatstVerstrekteJasnummer() {
        return laatstVerstrekteJasnummer;
    }

    public void setLaatstVerstrekteJasnummer(int laatstVerstrekteJasnummer) {
        this.laatstVerstrekteJasnummer = laatstVerstrekteJasnummer;
    }

    public String getJasMerk() {
        return jasMerk;
    }

    public void setJasMerk(String jasMerk) {
        this.jasMerk = jasMerk;
    }
}





