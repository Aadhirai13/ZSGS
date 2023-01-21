package assignments;

import java.util.*;

public class InterviewCall {
	
	static Queue<Integer> receptionHall = new LinkedList<>();
	static Queue<Integer> waitingHall = new LinkedList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=20;i++)
			goForInterview(i);
		
		System.out.println(receptionHall);
		System.out.println(waitingHall);
		
		
		enterInterview();
		System.out.println(receptionHall);
		System.out.println(waitingHall);
		
		goForInterview(21);
		System.out.println(receptionHall);
		System.out.println(waitingHall);
		
	}
	
	public static void goForInterview(int member) {
		if(receptionHall.size() == 5)
			addToWaitingHall(member);
		else
			addToReceptionHall(member);
	}
	
	public static void addToWaitingHall(int member) {
		waitingHall.add(member);
	}

	public static void addToReceptionHall(int member) {
		if(receptionHall.size() == 5)
			addToWaitingHall(member);
		else
			receptionHall.add(member);
	}
	
	public static void enterInterview() {
		if(receptionHall.size()==0)
			System.out.println("No candidates have been waiting for interview\n");
		else if(waitingHall.size()!=0){
			System.out.println(receptionHall.remove() + " gone for interview\n");
			receptionHall.add(waitingHall.remove());
		}
		else
			System.out.println(receptionHall.remove() + " gone for interview\n");
	}
}
