package com.engeto;

import java.time.LocalDate;
// hosty, které ubytováváme v hotelu
public class Klient {

    private String firstName;
    private String secondName;
    private LocalDate dateOfBirth;

// Konstruktor:
    public Klient (String firstName, String secondName, LocalDate dateOfBirth){
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;

    }
// Přístupové metody - gettery a settery:

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

//čitelný textový popis

    public void getDescription() {
        System.out.println(firstName + " " + secondName + " " + "datum narozeni " + dateOfBirth);
    }
}
