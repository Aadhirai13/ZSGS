package com.zsgs.flightreservation.repository;

import com.zsgs.flightreservation.dto.*;

import java.util.ArrayList;

public class AirlinesRepository {

    public static AirlinesRepository libraryDbInstance;
    private static ArrayList<Admin> adminCredentials = new ArrayList<>();
    private static ArrayList<User> userCredentials = new ArrayList<>();
    private static ArrayList<Flights> flightDetails = new ArrayList<>();
    private static ArrayList<Passengers> passengerDetails = new ArrayList<>();
    public String user = "";
    private AirlinesRepository() {

    }

    public static AirlinesRepository getInstance() {
        if (libraryDbInstance == null) {
            libraryDbInstance = new AirlinesRepository();
            libraryDbInstance.initialSetUp();
        }
        return libraryDbInstance;
    }

    public void initialSetUp(){
        setDefaultAdminDetails();
        setDefaultUserDetails();
        setDefaultFlightDetails();
    }

    public void setDefaultAdminDetails(){
        adminCredentials.add(new Admin("aadhirai" , "abc"));
        adminCredentials.add(new Admin("aadhi" , "def"));
    }

    public void setDefaultUserDetails(){
        userCredentials.add(new User("aadhirai" , "a@gmail.com" , "abc13"));
        userCredentials.add(new User("vijay" , "v@gmail.com" , "abc22"));
    }

    public void setDefaultFlightDetails(){
        flightDetails.add(new Flights(1 , "fchennai2cbe" , 50 , 10 , 1000 , 1500, "Chennai" , "Coimbatore"));
        flightDetails.add(new Flights(2 , "fcbe2chennai" , 50 , 10 ,1000 , 1500, "Coimbatore" , "Chennai"));
        flightDetails.add(new Flights(3 , "fchennai2trichy" , 50 , 10 ,1000 , 1500, "Chennai" , "Trichy"));
        flightDetails.add(new Flights(4 , "ftrichy2chennai" , 50 , 10 ,1000 , 1500, "Trichy" , "Chennai"));
    }

    public Admin checkValidAdmin(String userName, String password) {
        for (Admin adminCredential : adminCredentials) {
            if (adminCredential.getAdminName().equals(userName) && adminCredential.getAdminPassword().equals(password)) {
                return adminCredential;
            }
        }
        return null;
    }

    public User checkValidUser(String userName , String userPassword) {
        for (User userCredential : userCredentials) {
            if (userCredential.getUserName().equals(userName) && userCredential.getUserPassword().equals(userPassword)) {
                user = userName;
                return userCredential;
            }
        }
        return null;
    }

    public String getUserName(){
        return user;
    }

    public boolean registerNewUser(String userName , String userEmailID , String userPassword){
        if(checkInvalidEmailID(userEmailID)){
            return false;
        }
        else {
            userCredentials.add(new User(userName, userEmailID, userPassword));
            return true;
        }
    }

    private boolean checkInvalidEmailID(String userEmailId){
        for (User userCredential : userCredentials) {
            if (userCredential.getUserEmailId().equals(userEmailId)) {
                return true;
            }
        }
        return false;
    }

    public boolean addFlight(int flightID , String flightName , int totalTickets , int ticketPrice , int takkalTickets,
                             int takkalTicketPrice, String departureLocation , String arrivingLocation) {
        boolean addFlightInfo = true;
        for (Flights flight : flightDetails) {
            if (flight.getFlightID() == flightID) {
                addFlightInfo = false;
                break;
            }
        }
        if(addFlightInfo)
            flightDetails.add(new Flights(flightID,flightName,totalTickets,ticketPrice,takkalTickets,takkalTicketPrice,departureLocation,arrivingLocation));
        return addFlightInfo;
    }

    public boolean removeFlight(int flightID) {
        boolean removeFlightInfo = false;
        for (Flights flight : flightDetails) {
            if (flight.getFlightID() == flightID) {
                removeFlightInfo = true;
                int flightIndex = flightDetails.indexOf(flight);
                flightDetails.remove(flightIndex);
                break;
            }
        }
        return removeFlightInfo;
    }

    public ArrayList<String> getFlightDetails(){
        ArrayList<String> flightInformation = new ArrayList<>();
        for (Flights flight : flightDetails) {
            String str = "ID - " + flight.getFlightID() + " ,Name - " + flight.getFlightName() + " ,TicketsCount - " + flight.getTotalTickets() + " ,TakkalTicketsCount - " + flight.getTakkalTickets() + " ,TicketPrice - "
                    + flight.getTicketPrice() + " ,From - " + flight.getDepartureLocation() + " ,To - " + flight.getArrivingLocation();
            flightInformation.add(str);
        }
        return flightInformation;
    }

    public ArrayList<String> getPassengerDetails(){
        ArrayList<String> passengerInformation = new ArrayList<>();
        for (Passengers passenger : passengerDetails) {
            String str = "Booking ID - " + passenger.getBookingID() + " Flight ID - " + passenger.getFlightID() + " Name - " + passenger.getPassengerName() + " ,PP Num - " + passenger.getPassportNumber() +
                    " ,Mobile Num - " + passenger.getMobileNumber() + " ,Loc - " + passenger.getLocation()  + " ,Amount Payed - " + passenger.getAmountPayed() +
                    " ,Tickets Booked - " + passenger.getTicketsBooked() + " ,Takkal - " + passenger.getIsTakkal()  + " ,Takkal Tickets Booked - " + passenger.getTakkalTickets();
            passengerInformation.add(str);
        }
        return passengerInformation;
    }

    public String[] bookFlight(String passengerName,int passportNumber,int mobileNumber,String location,int flightID,String departureLocation, String arrivingLocation,int ticketsBooked,int takkalTickets,int bookingID,boolean isTakkal){
        int amountPayed = 0;
        for (Flights flight : flightDetails) {
            if (flight.getFlightID() == flightID && flight.getDepartureLocation().equals(departureLocation) && flight.getArrivingLocation().equals(arrivingLocation)) {
                if(isTakkal)
                    amountPayed = flight.getTakkalTicketPrice() * takkalTickets;
                else
                    amountPayed = flight.getTicketPrice() * ticketsBooked;
                flight.setTotalTickets(flight.getTotalTickets() - ticketsBooked);
                flight.setTakkalTickets(flight.getTakkalTickets() - takkalTickets);
                break;
            }
        }
        passengerDetails.add(new Passengers(passengerName,passportNumber,mobileNumber,location,amountPayed,ticketsBooked,takkalTickets,flightID,departureLocation,arrivingLocation,bookingID,isTakkal));
        String[] paymentInfo = new String[2];
        if(isTakkal)
            paymentInfo[0] = "Pay " + amountPayed + " to book " + takkalTickets + " tickets";
        else
            paymentInfo[0] = "Pay " + amountPayed + " to book " + ticketsBooked + " tickets";

        paymentInfo[1] = String.valueOf(amountPayed);
        return paymentInfo;
    }

    public void cancelTicket(int bookingID){
        for (Passengers passengers : passengerDetails) {
            if (passengers.getBookingID() == bookingID) {
                for (Flights flight : flightDetails) {
                    if (flight.getFlightID() == passengers.getFlightID()) {
                        flight.setTotalTickets(flight.getTotalTickets() + passengers.getTicketsBooked());
                        flight.setTakkalTickets(flight.getTakkalTickets() + passengers.getTakkalTickets());
                    }
                }
                passengerDetails.remove(passengers);
                break;
            }
        }
    }

    public String getTicket(int bookingID){
        String ticketInfo = "";
        for (Passengers passengers : passengerDetails) {
            if (passengers.getBookingID() == bookingID) {
                ticketInfo = "Booking ID\t\t\t  - " + passengers.getBookingID() + "\nPassenger Name\t\t  - " + passengers.getPassengerName() + "\nFlight ID\t\t\t  - " + passengers.getFlightID() +
                        "\nPassport Number\t\t  - " + passengers.getPassportNumber() + "\nTakkal\t\t\t\t  - " + passengers.getIsTakkal() + "\nTickets Booked\t\t  - " + passengers.getTicketsBooked() +
                        "\nTakkal Tickets Booked - " + passengers.getTakkalTickets() + "\nAmount Payed\t\t  - " + passengers.getAmountPayed() + "\nDeparture Location\t  - " + passengers.getDepartureLocation()
                        + "\nArriving Location\t  - " + passengers.getArrivingLocation() + "\n";
            }
        }
        if(ticketInfo == "")
            ticketInfo = "Booking ID not found...";
        return ticketInfo;
    }

    public boolean isFlightIDValid(int flightID){
        for (Flights flight : flightDetails) {
            if (flight.getFlightID() == flightID) {
                return true;
            }
        }
        return false;
    }

    public void updateFlight(boolean flightName,boolean totalTickets,boolean ticketPrice,boolean takkalTickets , boolean takkalTicketsPrice , boolean departureLocation,boolean arrivingLocation,int flightID,String updatingValue){
        if(flightName){
            for (Flights flight : flightDetails) {
                if (flight.getFlightID() == flightID) {
                    flight.setFlightName(updatingValue);
                }
            }
        } else if(totalTickets){
            for (Flights flight : flightDetails) {
                if (flight.getFlightID() == flightID) {
                    flight.setTotalTickets(Integer.parseInt(updatingValue));
                }
            }
        } else if (ticketPrice) {
            for (Flights flight : flightDetails) {
                if (flight.getFlightID() == flightID) {
                    flight.setTotalTickets(Integer.parseInt(updatingValue));
                }
            }
        }else if(takkalTickets){
            for (Flights flight : flightDetails) {
                if (flight.getFlightID() == flightID) {
                    flight.setTakkalTickets(Integer.parseInt(updatingValue));
                }
            }
        } else if (takkalTicketsPrice) {
            for (Flights flight : flightDetails) {
                if (flight.getFlightID() == flightID) {
                    flight.setTakkalTicketPrice(Integer.parseInt(updatingValue));
                }
            }
        } else if (departureLocation) {
            for (Flights flight : flightDetails) {
                if (flight.getFlightID() == flightID) {
                    flight.setDepartureLocation(updatingValue);
                }
            }
        } else if (arrivingLocation) {
            for (Flights flight : flightDetails) {
                if (flight.getFlightID() == flightID) {
                    flight.setArrivingLocation(updatingValue);
                }
            }
        }
    }
}
