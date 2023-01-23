package assignments;

import java.util.Scanner;

public class PayBill1 extends IvrCall1{

	public void display() {
		Scanner sc = new Scanner(System.in);

		int choice, amnt = 0;
		long phNumber;

        boolean ch = true, r = true;

        while(ch){

		
        	System.out.println("\n1. Pay Bill\t4. Go previous menu\t5. Go main menu");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                {	
                	System.out.println("Enter PostPaid Mobile Number ");
                	System.out.println("Note : This payment will be credited in your prepaid account and can't be used for recharge");
                    phNumber = sc.nextLong();
                    amnt =  sc.nextInt();
                    System.out.println("Payment Done ! ");
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
