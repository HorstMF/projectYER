package nl.yer.tuesday94;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ronald", "Wout", "Arnold", "Raphael"));

        names.stream().filter(name -> name.contains("a")).forEach(name -> {
            System.out.println(name);

        });

        names.stream().filter(name -> name.contentEquals("Arnold")).forEach(name -> {

            System.out.println(name);
        });
    }
}



