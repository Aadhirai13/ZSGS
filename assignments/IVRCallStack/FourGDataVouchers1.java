package assignments;

import java.util.Scanner;

public class FourGDataVouchers1 extends IvrCall1{

	public void display() {
		Scanner sc = new Scanner(System.in);
		int choice;

        boolean ch = true, r = true;

        while(ch){


        	System.out.println("\n4G Data Vouchers");
            System.out.println("1. Data ADD-ON\t2. No Daily Limit\t3. Top-Up"
            		+ "\t4. Go previous menu\t5. Go main menu");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                {	
                	System.out.println("Available Data Add-On Packs");
            		System.out.println("Rs.121 Pack - 12 GB\nRs.61 Pack - 6 GB\nRs.25 Pack - 2 GB\nRs15 Pack - 1 GB ");
                	break;
                }
                case 2:
                {
                	System.out.println("Available No Daily Limit Packs");
            		System.out.println("Rs.296 Pack - 25 GB , 30 Days ");
                	break;
                }
                case 3:
                {
                	System.out.println("Available Top-Up's");
                	System.out.println("Rs.100 Pack - Talktime - Rs.81.75\nRs.50 Pack - Talktime - Rs.39.37"
                			+ "\nRs.20 Pack - Talktime - Rs.14.95\nRs.10 Pack - Talktime - Rs.7.47");
                	break;
                }
                case 4:
                {
                	ch = false;
                	stack.pop();
                	IvrCall1 obj = stack.peek();
                	obj.display();
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
	}
}
