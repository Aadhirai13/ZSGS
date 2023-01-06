import java.util.Scanner;

public class Zsgs54{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int even = 0, odd = 0 ;
        int arrOdd[] = new int[50];
        int arrEven[] = new int[50];

        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(i%2==0){
                arrEven[even++]=arr[i];
            }
            else{
                arrOdd[odd++]=arr[i];
            }
        }

        for(int i=0;i<even;i++){
            for(int j=i+1;j<even;j++){
                if(arrEven[i]>arrEven[j]){
                    int t=arrEven[i];
                    arrEven[i]=arrEven[j];
                    arrEven[j]=t;
                }
            }
        }

        for(int i=0;i<odd;i++){
            for(int j=i+1;j<odd;j++){
                if(arrOdd[i]<arrOdd[j]){
                    int t=arrOdd[i];
                    arrOdd[i]=arrOdd[j];
                    arrOdd[j]=t;
                }
            }
        }

        int i,j=0,k=0;
        for(i=0,j=0,k=0;i<n && j<even && k<odd;i++){
            if(i%2==0){
                arr[i]=arrEven[j];
                j++;  
            } 
            else{     
                arr[i]=arrOdd[k];
                k++; 
            }
        }

        for(int s=0;s<n-1;s++)
            System.out.print(arr[s]);

        while(j<even){
            System.out.print(arrEven[j]);
            j++;
        }

        while(k<odd){
            System.out.print(arrOdd[k]);
            k++;
        }
    }
}