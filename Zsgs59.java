import java.util.*;

public class Zsgs59{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str=sc.nextLine();
        System.out.println("Enter substring : ");
        String subst=sc.nextLine();

        int m,n,findex=0,lindex=0,currindex=0,found=0; //currindex for calc equating substr length
        m=str.length();
        n=subst.length();
        for(int i=0;i<=m-n;i++){
            findex=i;
            int k=i;
            for(int j=0;j<n;j++){
                if(str.charAt(k)!=subst.charAt(j))
                    break;
                else{
                    currindex++;//1,2,3
                    k++;//6,7,8
                    if(currindex==n){
                        found=1;
                        break;
                    }
                }
            }
            if(found==1)
                break;
        }
        if(found==1)
            System.out.println(findex);
        else
            System.out.println("-1");
    }
}