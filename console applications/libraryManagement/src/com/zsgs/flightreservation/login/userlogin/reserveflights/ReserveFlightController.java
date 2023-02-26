package com.zsgs.flightreservation.login.userlogin.reserveflights;

import java.util.ArrayList;

public class ReserveFlightController implements ReserveFlightViewControllerCallBack , ReserveFlightModelControllerCallBack {

    private ReserveFlightControllerViewCallBack reserveFlightView;
    private ReserveFlightControllerModelCallBack reserveFlightModel;

    public ReserveFlightController(ReserveFlightView reserveFlightView){
        this.reserveFlightView = reserveFlightView;
        reserveFlightModel = new ReserveFlightModel(this);
    }

    public void bookFlight(String passengerName,int passportNumber,int mobileNumber,String location,int flightID,String departureLocation,String arrivingLocation,int ticketsBooked,int takkalTickets,int bookingID,boolean isTakkal){
        reserveFlightModel.bookFlight(passengerName,passportNumber,mobileNumber,location,flightID,departureLocation,arrivingLocation,ticketsBooked,takkalTickets,bookingID,isTakkal);
    }

    public String getUserName(){
        return reserveFlightModel.getUserName();
    }
    public void bookingSuccess(String[] paymentInfo){
        reserveFlightView.bookingSuccess(paymentInfo);
    }

    public void cancelFlight(int bookingID){
        reserveFlightModel.cancelFlight(bookingID);
    }

    public void cancellingSuccess(){
        reserveFlightView.cancellingSuccess();
    }

    public void getTicket(int bookingID){
        reserveFlightModel.getTicket(bookingID);
    }

    public void viewTicket(String ticketInfo){
        reserveFlightView.viewTicket(ticketInfo);
    }

    public void getFlightDetails(){
        reserveFlightModel.getFlightDetails();
    }

    public void showFlightDetails(ArrayList<String> flightDetails){
        reserveFlightView.showFlightDetails(flightDetails);
    }
}
