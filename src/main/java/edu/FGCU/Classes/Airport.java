package edu.FGCU.Classes;

public class Airport {
    String name;
    String airportCode;
    String location;
    String[] gatesForAirport;

    public Airport(String name, String airportCode, String location, String[] gatesForAirport) {
        this.name = name;
        this.airportCode = airportCode;
        this.location = location;
        this.gatesForAirport = gatesForAirport;
    }

    public Airport() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String[] getGatesForAirport() {
        return gatesForAirport;
    }

    public void setGatesForAirport(String[] gatesForAirport) {
        this.gatesForAirport = gatesForAirport;
    }
}
