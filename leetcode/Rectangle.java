package leet;

public class Rectangle{
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,1,1,0,0,1,1},{1,1,1,0,0,1,1},{1,0,0,0,0,1,1},
				{0,0,0,0,0,0,0},{1,1,0,0,1,1,1},{1,1,0,0,1,1,0},{1,1,0,0,1,1,0}};
		
		int col = (arr[0].length-1);
		for(int i=0;i<arr.length-1;i++) 
			checkForOne(arr,0,0,6);
		System.out.println(count + " rectangles");
	}
	public static void checkForOne(int a[][],int row,int s,int e) {
		int start[] = {-1,-1,-1,-1,-1,-1,-1};
		int end[] = {-1,-1,-1,-1,-1,-1,-1};
		for(int j=s;j<=e;j++) {
			if(a[row][j] == 1) {
				if(start[row] == -1)
					start[row] = j;
				continue;
			}
			else {
				end[row] = j-1;
				if((start[row] != end[row]) && (start[row] != -1 && end[row] != -1)) {
					int r = row+1;
					checkForOne(a,r,start[row],end[row]);
				}
				else
					count++;
			}
			
		}
	}

}
