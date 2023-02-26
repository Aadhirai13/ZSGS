package com.zsgs.flightreservation.login.adminlogin.manageflights.addremoveflight;

import java.util.Scanner;

public class AddRemoveFlightView implements AddRemoveFlightControllerViewCallBack {
    private Scanner scanner = new Scanner(System.in);
    private AddRemoveFlightViewControllerCallBack addRemoveFlightController;

    public AddRemoveFlightView(){
        addRemoveFlightController = new AddRemoveFlightController(this);
    }

    public void addRemoveFlight(int choice){
        switch (choice) {
            case 1: {
                System.out.println("------- Add Flight -------");
                System.out.println("Enter Flight ID");
                int flightID = scanner.nextInt();
                System.out.println("Enter Flight Name");
                String flightName = scanner.next();
                System.out.println("Enter Total Tickets");
                int totalTickets = scanner.nextInt();
                System.out.println("Enter Takkal Tickets");
                int takkalTickets = scanner.nextInt();
                System.out.println("Enter Ticket Price");
                int ticketPrice = scanner.nextInt();
                System.out.println("Enter Takkal Ticket Price");
                int takkalTicketPrice = scanner.nextInt();
                System.out.println("Enter Departure Location");
                String departureLocation = scanner.next();
                System.out.println("Enter Arriving Location");
                String arrivingLocation = scanner.next();

                addRemoveFlightController.addFlight(flightID,flightName,totalTickets,ticketPrice,takkalTickets,takkalTicketPrice,departureLocation,arrivingLocation);
                break;
            }
            case 2: {
                System.out.println("------- Remove Flight -------");
                System.out.println("Enter Flight ID to remove");
                int flightID = scanner.nextInt();
                addRemoveFlightController.removeFlight(flightID);
                break;
            }
        }
    }


    public void flightAddedSuccess(String addFlightSuccess){
        System.out.println(addFlightSuccess);
    }
    public void flightAddedFailure(String addFlightFailure){
        System.out.println(addFlightFailure);
    }

    public void flightremovedSuccess(String removeFlightSuccess){
        System.out.println(removeFlightSuccess);
    }

    public void flightremovedFailure(String removeFlightFailure){
        System.out.println(removeFlightFailure);
    }
}

