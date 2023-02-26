package com.zsgs.flightreservation.login.adminlogin.manageflights.updateflight;

public class UpdateFlightController implements UpdateFlightViewControllerCallBack , UpdateFlightModelControllerCallBack {
    
    private UpdateFlightControllerViewCallBack updateFlightView;
    private UpdateFlightControllerModelCallBack updateFlightModel;
    
    public UpdateFlightController(UpdateFlightView updateFlightView){
        this.updateFlightView = updateFlightView;
        updateFlightModel = new UpdateFlightModel(this);
    }
    
    public boolean isFlightIDValid(int flightID){
        return updateFlightModel.isFlightIDValid(flightID);
    }

    public void updateFlight(boolean flightName,boolean totalTickets,boolean ticketPrice,boolean takkalTickets,boolean takkalTicketPrice,boolean departureLocation,boolean arrivingLocation,int flightID,String updatingValue) {
        updateFlightModel.updateFlight(flightName,totalTickets,ticketPrice,takkalTickets,takkalTicketPrice,departureLocation,arrivingLocation,flightID,updatingValue);
    }

}
