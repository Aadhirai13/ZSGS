package com.zsgs.flightreservation.dto;

public class Flights {
    private int flightID;
    private String flightName;
    private int totalTickets;
    private int takkalTickets;
    private int ticketPrice;


    private int takkalTicketPrice;
    private String departureLocation;
    private String arrivingLocation;

    public Flights(int flightID , String flightName , int totalTickets , int takkalTickets, int ticketPrice , int takkalTicketPrice, String departureLocation , String arrivingLocation){
        setFlightID(flightID);
        setFlightName(flightName);
        setTotalTickets(totalTickets);
        setTicketPrice(ticketPrice);
        setDepartureLocation(departureLocation);
        setArrivingLocation(arrivingLocation);
        setTakkalTickets(takkalTickets);
        setTakkalTicketPrice(takkalTicketPrice);
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivingLocation() {
        return arrivingLocation;
    }

    public void setArrivingLocation(String arrivingLocation) {
        this.arrivingLocation = arrivingLocation;
    }
    public int getTakkalTickets() {
        return takkalTickets;
    }

    public void setTakkalTickets(int takkalTickets) {
        this.takkalTickets = takkalTickets;
    }

    public int getTakkalTicketPrice() {
        return takkalTicketPrice;
    }

    public void setTakkalTicketPrice(int takkalTicketPrice) {
        this.takkalTicketPrice = takkalTicketPrice;
    }
}
