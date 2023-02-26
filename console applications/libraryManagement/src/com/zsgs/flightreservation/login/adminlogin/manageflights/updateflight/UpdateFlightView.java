package com.zsgs.flightreservation.login.adminlogin.manageflights.updateflight;

import java.util.Scanner;

public class UpdateFlightView implements UpdateFlightControllerViewCallBack {

    private Scanner scanner = new Scanner(System.in);
    private UpdateFlightViewControllerCallBack updateFlightController;

    public UpdateFlightView(){
        updateFlightController = new UpdateFlightController(this);
    }

    public void updateFlight(){
        while(true) {
            System.out.println("Enter flight ID to update");
            int flightID = scanner.nextInt();
            if(!updateFlightController.isFlightIDValid(flightID)){
                System.out.println("Flight ID not available. Enter valid flight ID");
                continue;
            }

            System.out.println("Press 1 to change flightName \nPress 2 to change totalTickets \nPress 3 to change ticketPrice " +
                    "\nPress 4 to change departureLocation\nPress 5 to change arrivingLocation \nPress 6 to change takkal tickets " +
                    "\nPress 7 to change takkal tickets price \n" + "\nPress 8 to save the update \n");
            int choice = scanner.nextInt();
            switch (choice) {

//                flightName,totalTickets, ticketPrice, takkalTickets ,  takkalTicketsPrice ,  departureLocation, arrivingLocation,int flightID,String updatingValue
                case 1: {
                    System.out.println("Enter new flight name");
                    String flightName = scanner.next();
                    updateFlightController.updateFlight(true,false,false,false,false,false,false,flightID,flightName);
                    System.out.println("Flight Name updated successfully\n");
                    break;
                }
                case 2: {
                    System.out.println("Enter new tickets count");
                    String totalTickets = scanner.next();
                    updateFlightController.updateFlight(false,true,false,false,false,false,false,flightID,totalTickets);
                    System.out.println("Tickets Count updated successfully\n");
                    break;
                }
                case 3: {
                    System.out.println("Enter new ticket price");
                    String ticketPrice = scanner.next();
                    updateFlightController.updateFlight(false,false,true,false,false,false,false,flightID,ticketPrice);
                    System.out.println("Ticket Price updated successfully\n");
                    break;
                }
                case 4: {
                    System.out.println("Enter new departure location");
                    String departureLocation = scanner.next();
                    updateFlightController.updateFlight(false,false,false,false,false,true,false,flightID,departureLocation);
                    System.out.println("Departure Location updated successfully\n");
                    break;
                }
                case 5: {
                    System.out.println("Enter new arriving location");
                    String arrivingLocation = scanner.next();
                    updateFlightController.updateFlight(false,false,false,false,false,false,true,flightID,arrivingLocation);
                    System.out.println("Arriving Location updated successfully\n");
                    break;
                }
                case 6: {
                    System.out.println("Enter new takkal tickets count");
                    String takkalTickets = scanner.next();
                    updateFlightController.updateFlight(false,false,false,true,false,false,false,flightID,takkalTickets);
                    System.out.println("Takkal tickets Count updated successfully\n");
                    break;
                }
                case 7: {
                    System.out.println("Enter new takkal tickets price");
                    String takkalTicketsPrice = scanner.next();
                    updateFlightController.updateFlight(false,false,false,false,true,false,false,flightID,takkalTicketsPrice);
                    System.out.println("Takkal tickets Count updated successfully\n");
                    break;
                }
                case 8: {
                    System.out.println("------- Flight changes updated successfully -------");
                    return;
                }
            }
        }
    }
}
