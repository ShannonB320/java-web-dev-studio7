package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String title;
    private int storageCapacity;
    private int usedStorage;
    ArrayList<String> content;


    public BaseDisc(String title, int storageCapacity, int usedStorage, ArrayList<String> content) {
        this.title = title;
        this.storageCapacity = storageCapacity;
        this.usedStorage = usedStorage;
        this.content = content;
    }

    public BaseDisc(String title, int storageCapacity) {
        this.title = title;
        this.storageCapacity = storageCapacity;
    }

    //getters
    public String getTitle() { return this.title; }
    public int getStorageCapacity() { return this.storageCapacity; }
    public int getUsedStorage() {return this.usedStorage; }
    public ArrayList<String> getContent() {return this.content; }

    //setters


    //Class methods

    public void reportDiscData() {
        System.out.println("Disc Title: " + this.title + "\nStorage Available: " + this.storageCapacity +
                " minutes\nStorage Used: " + this.usedStorage + " minutes\n");
    }

    public void playDisc() {
        System.out.println("Playing " + this.title + "...");
        for(String datafile : content) {
            System.out.println(datafile);
        }
        System.out.println("\n");
    }



}
