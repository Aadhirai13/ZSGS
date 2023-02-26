package com.zsgs.flightreservation.login.adminlogin.manageflights.addremoveflight;

public class AddRemoveFlightController implements AddRemoveFlightViewControllerCallBack, AddRemoveFlightModelControllerCallBack {

    private AddRemoveFlightControllerViewCallBack addRemoveFlightView;
    private AddRemoveFlightControllerModelCallBack addRemoveFlightModel;

    public AddRemoveFlightController(AddRemoveFlightView addRemoveFlightView){
        this.addRemoveFlightView = addRemoveFlightView;
        addRemoveFlightModel = new AddRemoveFlightModel(this);
    }

    public void addFlight(int flightID , String flightName , int totalTickets ,int takkalTickets, int ticketPrice ,int takkalTicketPrice, String departureLocation , String arrivingLocation){
        addRemoveFlightModel.addFlight(flightID,flightName,totalTickets,ticketPrice,takkalTickets,takkalTicketPrice,departureLocation,arrivingLocation);
    }

    public void removeFlight(int flightID){
        addRemoveFlightModel.removeFlight(flightID);
    }

    public void flightAddedSuccess(String addFlightSuccess){
        addRemoveFlightView.flightAddedSuccess(addFlightSuccess);
    }
    public void flightAddedFailure(String addFlightFailure){
        addRemoveFlightView.flightAddedFailure(addFlightFailure);
    }

    public void flightremovedSuccess(String removeFlightSuccess){
        addRemoveFlightView.flightremovedSuccess(removeFlightSuccess);
    }
    public void flightremovedFailure(String removeFlightFailure){
        addRemoveFlightView.flightremovedFailure(removeFlightFailure);
    }
}
