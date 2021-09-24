package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc{

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public DVD(String title, int storageCapacity, int usedStorage, ArrayList<String> scenes) {
        super(title, storageCapacity, usedStorage, scenes);
    }

    public DVD(String name, int storageCapacity) {
        super(name, storageCapacity);
    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void findScratch() {
        int random = (int) Math.floor(Math.random() * 10);
        if (random >= 8) {
            System.out.println("Oh no! There's a scratch on the DVD!");
        } else {
            System.out.println("No scratches!");
        }
    }


}
