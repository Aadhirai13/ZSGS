package com.zsgs.flightreservation.login.userlogin.reserveflights;

import com.zsgs.flightreservation.repository.AirlinesRepository;

import java.util.ArrayList;

public class ReserveFlightModel implements ReserveFlightControllerModelCallBack{

    private ReserveFlightModelControllerCallBack reserveFlightController;

    public ReserveFlightModel(ReserveFlightController reserveFlightController){
        this.reserveFlightController = reserveFlightController;
    }

    public void bookFlight(String passengerName,int passportNumber,int mobileNumber,String location,int flightID,String departureLocation,String arrivingLocation,int ticketsBooked, int takkalTickets,int bookingID,boolean isTakkal){
        String[] paymentInfo = AirlinesRepository.getInstance().bookFlight(passengerName,passportNumber,mobileNumber,location,flightID,departureLocation,arrivingLocation,ticketsBooked,takkalTickets,bookingID,isTakkal);
        reserveFlightController.bookingSuccess(paymentInfo);
    }

    public void cancelFlight(int bookingID){
        AirlinesRepository.getInstance().cancelTicket(bookingID);
        reserveFlightController.cancellingSuccess();
    }

    public String getUserName(){
        return AirlinesRepository.getInstance().getUserName();
    }
    public void getTicket(int bookingID){
        String ticketInfo = AirlinesRepository.getInstance().getTicket(bookingID);
        reserveFlightController.viewTicket(ticketInfo);
    }

    public void getFlightDetails(){
        ArrayList<String> flightDetails = AirlinesRepository.getInstance().getFlightDetails();
        reserveFlightController.showFlightDetails(flightDetails);
    }

}
