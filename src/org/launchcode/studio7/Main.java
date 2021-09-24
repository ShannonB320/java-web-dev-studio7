package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD soundtrack1 = new CD("ACDC", 90, 76, new ArrayList<>(Arrays.asList("Highway to Hell", "Back in Black", "You Shook Me All Night Long", "Hells Bells", "Shoot to Thrill")));
        CD soundtrack2 = new CD("Led Zeppelin", 90, 87, new ArrayList<>(Arrays.asList("Stairway to Heaven", "Immigrant Song", "Kashmir", "Whole Lotta Love", "Good Times Bad Times")));

        DVD movie1 = new DVD("The Haunted Mansion", 240, 99, new ArrayList<>(Arrays.asList("Scene 1", "Scene 2", "Scene 3", "Scene 4", "Scene 5", "Scene 6")));
        DVD movie2 = new DVD("Hocus Pocus", 240, 96, new ArrayList<>(Arrays.asList("Scene 1", "Scene 2", "Scene 3", "Scene 4", "Scene 5")));

        // TODO: Call each CD and DVD method to verify that they work as expected.

        soundtrack1.spinDisc();
        movie1.spinDisc();

        soundtrack2.findScratch();
        movie2.findScratch();

        soundtrack1.reportDiscData();
        movie1.reportDiscData();

        soundtrack2.playDisc();
        movie2.playDisc();


    }
}
