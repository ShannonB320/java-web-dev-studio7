package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc{


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(String title, int storageCapacity, int usedStorage, ArrayList<String> songs) {
        super(title, storageCapacity, usedStorage, songs);
    }

    public CD(String name, int storageCapacity) {
        super(name, storageCapacity);
    }



    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void findScratch() {
        int random = (int) Math.floor(Math.random() * 10);
        if (random >= 6) {
            System.out.println("Oh no! There's a scratch on the CD!");
        } else {
            System.out.println("No scratches!");
        }
    }


}
