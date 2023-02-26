package com.zsgs.flightreservation.dto;

public class Passengers {
    private String passengerName;
    private int passportNumber;
    private int mobileNumber;
    private String location;
    private int amountPayed;
    private int ticketsBooked;
    private static int bookingID = 1;
    private int flightID;
    private String departureLocation;
    private String arrivingLocation;
    private String travelDate;
    private boolean isTakkal;

    private int takkalTickets;

    public Passengers(String passengerName , int passportNumber , int mobileNumber , String location ,
                      int amountPayed , int ticketsBooked , int takkalTickets , int flightID , String departureLocation, String arrivingLocation, int bookingID, boolean isTakkal){
        setPassengerName(passengerName);
        setPassportNumber(passportNumber);
        setMobileNumber(mobileNumber);
        setLocation(location);
        setAmountPayed(amountPayed);
        setTicketsBooked(ticketsBooked);
        setBookingID(bookingID);
        setFlightID(flightID);
        setDepartureLocation(departureLocation);
        setArrivingLocation(arrivingLocation);
        setIsTakkal(isTakkal);
        setTakkalTickets(takkalTickets);
    }
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAmountPayed() {
        return amountPayed;
    }

    public void setAmountPayed(int amountPayed) {
        this.amountPayed = amountPayed;
    }

    public int getTicketsBooked() {
        return ticketsBooked;
    }

    public void setTicketsBooked(int ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
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
    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public boolean getIsTakkal() {
        return isTakkal;
    }

    public void setIsTakkal(boolean takkal) {
        isTakkal = takkal;
    }

    public int getTakkalTickets() {
        return takkalTickets;
    }

    public void setTakkalTickets(int takkalTickets) {
        this.takkalTickets = takkalTickets;
    }


}
