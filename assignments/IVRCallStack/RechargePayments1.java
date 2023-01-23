package assignments;

import java.util.Scanner;

public class RechargePayments1 extends IvrCall1{

	public void display() {
		Scanner sc = new Scanner(System.in);
		int choice;
        
        	System.out.println("\nRecharge and Payments");
            System.out.println("1. 4G Data Vouchers\t2. Recharge for a friend\t3. Pay bill"
            		+ "\t4. Go previous menu\t5. Go main menu");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                {
                	FourGDataVouchers1 vouchers = new FourGDataVouchers1();
                	stack.add(vouchers);
                	vouchers.display();
                   	break;
                }
                case 2:
                {
                	RechargeForFriend1 friendRecharge = new RechargeForFriend1();
                	stack.add(friendRecharge);
                	friendRecharge.display();
                	break;
                }
                case 3:
                {
                	PayBill1 payBill = new PayBill1();
                	stack.add(payBill);
                	payBill.display();
                	break;
                }
                case 4:
                {
                	stack.pop();
                	IvrCall1 obj = stack.peek();
                	obj.display();
                	break;
                }
                case 5:
                {
                	new IVRCall().main(null);
                	break;
                }
            }
	}

}
