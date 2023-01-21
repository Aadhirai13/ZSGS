package assignments;

import java.util.Scanner;

public class RechargeForFriend {

	public static boolean showOptions() {
		Scanner sc = new Scanner(System.in);

		int choice;
		long phNumber;
		boolean ch = true, r = true;
		
        while(ch){

        	System.out.println("\nRecharge for Friend");
        	System.out.println("\n1. Plans avilable\t4. Go previous menu\t5. Go main menu");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                {	
                	System.out.println("Enter Mobile Number ");
                    phNumber = sc.nextLong();
                    System.out.println("Available Plans");
            		System.out.println("Rs.719 Pack - 2 GB/Day (84 days)\nRs.666 Pack - 1.5 GB/Day (84 days)\n"
            				+ "Rs.349 Pack - 2.5 GB/Day (30 days)\nRs.299 Pack - 2 GB/Day (28 days)");
            		ch = true;
                	r = false;
                	break;
                }
                case 4:
                {
                	ch = false;
                	r = true;
                	break;
                }
                case 5:
                {
                	ch = false;
                	new IVRCall().main(null);
                	break;
                }
            }
        }
        return r;
	}

}
