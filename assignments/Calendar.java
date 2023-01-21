package assignments;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println("Enter year : ");
		int year = sc.nextInt();
		boolean leap = isLeap(year); 
		int start = firstDayFind(year);
		for(int i=0;i<12;i++) {
			System.out.println("\n\t" + months[i]);
			printDays();
			int totalDays = daysCount(i,leap);
			start = printdates(start,totalDays);
		}
	}
	
	public static boolean isLeap(int yr) {
		if((yr % 100 != 0 && yr % 4 == 0) || (yr % 400 == 0))
			return true;
		return false;
	}
	
	public static int firstDayFind(int yr) {
		yr = yr % 400;
		int year[] = new int[3];
		year[0] = (yr / 100) * 5;
		year[1] = ((yr % 100) / 4) * 2;
		year[2] = (yr % 100) - ((yr % 100) / 4);
		int total = 0;
		for(int i=0;i<3;i++)
			total += year[i];
		return (total % 7);
	}
	
	public static void printDays() {
		String days[] = {"S","M","T","W","T","F","S"};
		for(int i=0;i<7;i++)
			System.out.print( "  " + days[i]);
		System.out.println();
	}
	
	public static int daysCount(int i,boolean leap) {
		int days = 0;
		switch(i) {
			case 0,2,4,6,7,9,11:{
				days = 31;
				break;
			}
			case 1:
			{
				if(leap)
					days = 29;	
				else
					days = 28;
				break;
			}
			case 3,5,8,10:{
				days = 30;
				break;
			}
		}
		return days;
	}
	
	public static int printdates(int s, int e) {
		int num = 1,j = 0;
		boolean started = true;
		outer:
		for(int i=1;i<=6;i++) {
			for(j=0;j<7;j++) {
				if((j<s) && started)
					System.out.print("   ");
				else {
					started = false;
					if(num < 10)
						System.out.print("  " + num++);
					else
						System.out.print(" " + num++);
					if(num > e)
						break outer;
				}
			}
			System.out.println();
		}
		if(j+1 == 7)
			return 0;
		return j+1;
	}
}