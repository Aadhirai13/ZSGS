package assignments;

import java.util.Scanner;

public class RechargePayments {

	public static boolean showPlans() {
		Scanner sc = new Scanner(System.in);
		int choice;
        boolean ch = true, r = true;

        while(ch){

        	System.out.println("\nRecharge and Payments");
            System.out.println("1. 4G Data Vouchers\t2. Recharge for a friend\t3. Pay bill"
            		+ "\t4. Go previous menu\t5. Go main menu");
            choice = sc.nextInt();
            FourGDataVouchers vouchers = new FourGDataVouchers();
            RechargeForFriend friendRecharge = new RechargeForFriend();
            PayBill payBill = new PayBill();

            switch(choice){
                case 1:
                {
                	ch = vouchers.showOptions();
                	r = false;
                	break;
                }
                case 2:
                {
                	ch = friendRecharge.showOptions();
                	r = false;
                	break;
                }
                case 3:
                {
                	ch = payBill.showOptions();
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
