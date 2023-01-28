package com.driver;

public class Group {
    private String name;
    private int numberOfParticipants;

    private String admin;

    public Group(){

    }

    public Group(String Name,int NumberOfParticipants){
        this.name=Name;
        this.numberOfParticipants=NumberOfParticipants;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfParticipants() {
        return this.numberOfParticipants;
    }
}
