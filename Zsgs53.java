import java.util.*;

public class Zsgs53{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        String str,newStr="",num="";
        int n;
        str=sc.nextLine();
        char c[]=str.toCharArray();
        
        for(int i=0;i<str.length();i++){
            if(!(c[i]>='0' && c[i]<='9')){
                if(num != ""){
                    n=Integer.parseInt(num);
                    for(int j=0;j<n;j++)
                        System.out.print(newStr);
                        newStr="";
                }
                newStr += c[i];
                num = "";
            }
            else{
                num += c[i];
            }
        }
        n=Integer.parseInt(num);
        for(int j=0;j<n;j++)
            System.out.print(newStr);
    }
}