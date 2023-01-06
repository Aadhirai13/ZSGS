import java.util.*;

public class Zsgs6{

    public static void main(String[] args){

        List<Integer> rollNo = new ArrayList<Integer>();

        List<Integer> group1 = new ArrayList<Integer>();
        List<Integer> group2 = new ArrayList<Integer>();
        List<Integer> group3 = new ArrayList<Integer>();
        List<Integer> group4 = new ArrayList<Integer>();

        for(int i=101;i<=120;i++)
            rollNo.add(i);

        for(int roll : rollNo){            
            if(roll % 4 == 1)
                group1.add(roll);
            
            if(roll % 4 == 2)
                group2.add(roll);
            
            if(roll % 4 == 3)
                group3.add(roll);

            if(roll % 4 == 0)
                group4.add(roll);
        }
        
        System.out.println(group1 + ", " + group2 + ", " + group3 + ", " + group4);
    }
}