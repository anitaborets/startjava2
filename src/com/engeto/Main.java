package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		Klient Adela = new Klient("Adela","Malíkova", LocalDate.of(1993,03,13));
		Klient Jan = new Klient("Jan","Dvořáček", LocalDate.of(1995,05,05));

		ArrayList<Room> rooms = new ArrayList<>();
		Room room1 = new Room(1,1,true,true,1000);
		Room room2 = new Room(2,1,true,true,1000);
		Room room3 = new Room(3,3,false,true,2400);
		rooms.add(room1);
		rooms.add(room2);
		rooms.add(room3);

		ArrayList<Booking> reservations = new ArrayList<>();
		Booking reservation1 = new Booking(Adela, room1, LocalDate.of(2021,7,19), LocalDate.of(2021,7,26), "Služobný");
		Booking reservation2 = new Booking(Jan, room3, LocalDate.of(2021,9,1), LocalDate.of(2021,9,14), "Rekreačný");
		reservation2.setRoommate("Adela Malíkova");

		reservations.add(reservation1);
		reservations.add(reservation2);

		Adela.getDescription();
		Jan.getDescription();
		room1.getDescription();
		room2.getDescription();
		room3.getDescription();


		System.out.println(reservations.toString());
	}
}
