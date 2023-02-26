package com.zsgs.flightreservation.login.adminlogin.manageflights;

import com.zsgs.flightreservation.login.adminlogin.manageflights.addremoveflight.AddRemoveFlightView;
import com.zsgs.flightreservation.login.adminlogin.manageflights.updateflight.UpdateFlightView;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageFlightsView implements ManageFlightsControllerViewCallBack{

    private Scanner scanner = new Scanner(System.in);
    private ManageFlightsViewControllerCallBack manageFlightsController;
    private AddRemoveFlightView addRemoveFlightView;
    private UpdateFlightView updateFlightView;

    public ManageFlightsView(){
        manageFlightsController = new ManageFlightsController(this);
        addRemoveFlightView = new AddRemoveFlightView();
        updateFlightView = new UpdateFlightView();
    }

    public void viewManageFlights(){
        outer:
        while(true) {
            System.out.println("Press 1 to Add Flight \nPress 2 to Remove Flight \nPress 3 to Update Flight Details " +
                    "\nPress 4 to show Flight Details \nPress 5 to show Passenger Details \nPress 6 to exit from application\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1, 2: {
                    addRemoveFlightView.addRemoveFlight(choice);
                    break;
                }
                case 3: {
                    System.out.println("------- Update Flight -------");
                    updateFlightView.updateFlight();
                    break;
                }
                case 4: {
                    System.out.println("------- Flight Details -------");
                    manageFlightsController.getFlightDetails();
                    break;
                }
                case 5: {
                    System.out.println("------- Passenger Details -------");
                    manageFlightsController.getPassengerDetails();
                    break;
                }
                case 6: {
                    System.out.println("------- Thank You -------");
                    System.exit(0);
                }
            }
        }
    }

    public void showFlightDetails(ArrayList<String> flightDetails){
        for(String flightDetail : flightDetails)
            System.out.println(flightDetail);
    }

    public void showPassengerDetails(ArrayList<String> passengerDetails){
        for(String passengerDetail : passengerDetails)
            System.out.println(passengerDetail);
    }
}
