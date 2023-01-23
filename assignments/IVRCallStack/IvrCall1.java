package assignments;

import java.util.*;

public class IvrCall1 {
	static Scanner sc = new Scanner(System.in);
	static Stack<IvrCall1> stack = new Stack<IvrCall1>();

	public static void main(String[] args) {
		
		IvrCall1 obj = new IvrCall1();
		stack.push(obj);
		obj.display();
	}
	
	public void display() {
		
        int choice;

        	System.out.println("Choose a language");
            System.out.println("1. English\t2. Tamil\t3.End the call");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                {
                	System.out.println("You chose English");
                	RechargePayments1 recharge = new RechargePayments1();
                	stack.add(recharge);
                	recharge.display();
                	break;
                }
                case 2:
                {
                	System.out.println("You chose Tamil");
                	RechargePayments1 recharge = new RechargePayments1();
                	stack.add(recharge);
                	recharge.display();
                	break;
                }
                case 3:
                {
                	System.out.println("The call is ended. Thank you for calling...");
                	break;
                }
                default:
                    break;
            }
	}

}
