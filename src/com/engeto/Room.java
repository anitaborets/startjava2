package com.engeto;

public class Room {
//pokoj
    int number;
    int bed;
    boolean balkony;
    boolean view;
    int price;

// Konstruktor:
    public Room (int number, int bed, boolean balkony, boolean view, int price){
        this.number = number;
        this.bed = bed;
        this.balkony = balkony;
        this.view = view;
        this.price = price;
    }
// Přístupové metody - gettery a settery:

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public boolean isBalkony() {
        return balkony;
    }

    public void setBalkony(boolean balkony) {
        this.balkony = balkony;
    }

    public boolean isView() {
        return view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //čitelný textový popis

    public void getDescription() {
        System.out.println("Pokoj čislo " + number);
        System.out.println("Počet lůžek " + bed);
        if (balkony == true){
            System.out.println("Balkon");
        }
        if (view == true){
            System.out.println("Výhled na moře");
        }
        System.out.println("Cena za noc " + price + " CZK");
        System.out.println("***************");

    }
}
