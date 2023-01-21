package assignments;

import java.util.Scanner;

public class IVRCall {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
        int choice;
        boolean ch = true;

        while(ch){

        	System.out.println("Choose a language");
            System.out.println("1. English\t2. Tamil\t3.End the call");
            choice = sc.nextInt();
            RechargePayments recharge = new RechargePayments();

            switch(choice){
                case 1:
                {
                	System.out.println("You chose English");
                	ch = recharge.showPlans();
                	break;
                }
                case 2:
                {
                	System.out.println("You chose Tamil");
                	ch = recharge.showPlans();
                	break;
                }
                case 3:
                {
                	System.out.println("The call is ended. Thank you for calling...");
                	ch = false;
                	break;
                }
                default:
                    break;
            }
        }
	}

}
