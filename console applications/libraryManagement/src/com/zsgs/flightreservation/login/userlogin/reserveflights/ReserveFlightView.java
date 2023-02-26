package com.zsgs.flightreservation.login.userlogin.reserveflights;

import com.zsgs.flightreservation.login.adminlogin.AdminLoginView;

import java.util.ArrayList;
import java.util.Scanner;

public class ReserveFlightView implements ReserveFlightControllerViewCallBack {

    private Scanner scanner = new Scanner(System.in);
    private ReserveFlightViewControllerCallBack reserveFlightController;

    public ReserveFlightView(){
        reserveFlightController = new ReserveFlightController(this);
    }

    public void reserveFlight(){
        outer:
        while(true) {
            System.out.println("Press 1 to Book Flight \nPress 2 to Cancel Flight \nPress 3 to View Tickets \nPress 4 to view Flight Details \nPress 5 to logout from application\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter current date - ");
                    String currDate = scanner.next();
                    System.out.println("Enter travel date - ");
                    String travelDate = scanner.next();
                    if(validForTakkal(currDate,travelDate))
                        withTakkalBookings();
                    else
                        withoutTakkalBookings(false);
                    break;
                }
                case 2: {
                    System.out.println("------- Cancel Flight -------");
                    System.out.println("Enter booking ID - ");
                    int bookingID = scanner.nextInt();
                    reserveFlightController.cancelFlight(bookingID);
                    break;
                }
                case 3: {
                    System.out.println("------- Viewing Tickets -------");
                    System.out.println("Enter booking ID - ");
                    int bookingID = scanner.nextInt();
                    reserveFlightController.getTicket(bookingID);
                    break;
                }
                case 4: {
                    System.out.println("------- Flight Details -------");
                    reserveFlightController.getFlightDetails();
                    break;
                }
                case 5: {
                    System.out.println("------- Thank You for visiting -------");
                    AdminLoginView adminLoginView = new AdminLoginView();
                    adminLoginView.viewadminLoginDetails();
                }
            }
        }
    }

    public boolean validForTakkal(String currDate , String travelDate){
        int cDate = Integer.parseInt(currDate.substring(0,2)) , tDate = Integer.parseInt(travelDate.substring(0,2));
        int cMonth = Integer.parseInt(currDate.substring(3,5)) , tMonth = Integer.parseInt(travelDate.substring(3,5));
        int cYear = Integer.parseInt(currDate.substring(6)) , tYear = Integer.parseInt(travelDate.substring(6));
        if(cMonth == tMonth && cYear == tYear && (cDate + 1 == tDate))
            return true;
        return false;
    }

    public void withoutTakkalBookings(boolean isTakkal){
        System.out.println("------- Book Flight -------");
        String passengerName = reserveFlightController.getUserName();
        System.out.println("Enter passport number - ");
        int passportNumber = scanner.nextInt();
        System.out.println("Enter mobile number - ");
        int mobileNumber = scanner.nextInt();
        System.out.println("Enter location - ");
        String location = scanner.next();
        System.out.println("Enter flight ID - ");
        int flightID = scanner.nextInt();
        System.out.println("Enter Departure Location - ");
        String departureLocation = scanner.next();
        System.out.println("Enter Arriving Location - ");
        String arrivingLocation = scanner.next();
        System.out.println("Enter booking ID - ");
        int bookingID = scanner.nextInt();
        int ticketsBooked;
        int takkalTickets;
        if(isTakkal){
            System.out.println("Enter takkal tickets count - ");
            takkalTickets = scanner.nextInt();
            ticketsBooked = 0;
        }
        else{
            System.out.println("Enter tickets count - ");
            ticketsBooked = scanner.nextInt();
            takkalTickets = 0;
        }
        reserveFlightController.bookFlight(passengerName,passportNumber,mobileNumber,location,flightID,departureLocation,arrivingLocation,ticketsBooked,takkalTickets,bookingID,isTakkal);
    }

    public void withTakkalBookings(){
        System.out.println("Press 1 to Normal Booking \nPress 2 to Takkal Booking");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
            {
                withoutTakkalBookings(false);
            }
            case 2:
            {
                withoutTakkalBookings(true);
            }
        }
    }
    public void bookingSuccess(String[] paymentInfo){
        System.out.println(paymentInfo[0]);
        int amount = scanner.nextInt();
        if(amount == Integer.parseInt(paymentInfo[1]))
            System.out.println("------- Ticket booked successfully -------");
        else {
            System.out.println("------- Amount to pay is " + paymentInfo[1] + " -------");
            bookingSuccess(paymentInfo);
        }
    }
    public void cancellingSuccess(){
        System.out.println("------- Ticket cancelled successfully -------");
    }

    public void viewTicket(String ticketInfo){
        System.out.println(ticketInfo);
    }

    public void showFlightDetails(ArrayList<String> flightDetails){
        for(String flightDetail : flightDetails)
            System.out.println(flightDetail);
    }
}
