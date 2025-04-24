package LeetCodeMediumProblems;

import java.util.ArrayList;
import java.util.Collections;

public class Q3066
{
    public static void main(String[] args) {
        int[] nums = {2,11,10,1,3};
        int k = 10;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:nums)
            arr.add(i);
        int c = 0;
        Collections.sort(arr);
        while(arr.size()>1 && arr.get(0)<k)
        {
            if(arr.size()>1)
            {
                arr.add((arr.get(0)*2 + arr.get(1)));
                arr.remove(0);
                arr.remove(0);
            }
            Collections.sort(arr);
            c++;
        }
        System.out.println(c);;

    }
}
