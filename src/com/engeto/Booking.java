package com.engeto;

import java.time.LocalDate;

public class Booking {
    Klient mainHost;
    String roommate;
    Room occupatedRoom;
    LocalDate beginningOfStay;
    LocalDate endOfStay;
    String typOfStay; //true - služobny, false - rekreačny pobyt

    // Konstruktor:
    public Booking(Klient mainHost, Room occupatedRoom, LocalDate beginningOfStay, LocalDate endOfStay, String typOfStay) {
        this.mainHost = mainHost;
        this.occupatedRoom = occupatedRoom;
        this.beginningOfStay = beginningOfStay;
        this.endOfStay = beginningOfStay;
        this.typOfStay = typOfStay;
    }

    public Klient getMainHost() {
        return mainHost;
    }

    public void setMainHost(Klient mainHost) {
        this.mainHost = mainHost;
    }

    public String getRoommate() {
        return roommate;
    }

    public void setRoommate(String roommate) {
        this.roommate = roommate;
    }

    public Room getOccupatedRoom() {
        return occupatedRoom;
    }

    public void setOccupatedRoom(Room occupatedRoom) {
        this.occupatedRoom = occupatedRoom;
    }

    public LocalDate getBeginningOfStay() {
        return beginningOfStay;
    }

    public void setBeginningOfStay(LocalDate beginningOfStay) {
        this.beginningOfStay = beginningOfStay;
    }

    public LocalDate getEndOfStay() {
        return endOfStay;
    }

    public void setEndOfStay(LocalDate endOfStay) {
        this.endOfStay = endOfStay;
    }

    public String getTypOfStay() {
        return typOfStay;
    }

    public void setTypOfStay(String typOfStay) {
        this.typOfStay = typOfStay;
    }

    @Override
    public String toString() {

            return ""
                    + "Pokoj čislo " + getOccupatedRoom().number
                    + "  rezervovaný od  " + beginningOfStay
                    + " do " + endOfStay
                    + " Na meno:  " + getMainHost().getFirstName() + " " + getMainHost().getSecondName()
                    + "  Spolubyvajucí:  " + getRoommate()
                    + "  Pobyt:  " + typOfStay + "\n";

        }



}