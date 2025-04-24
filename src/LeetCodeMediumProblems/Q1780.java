package LeetCodeMediumProblems;

import java.util.HashSet;

public class Q1780
{
    public static void main(String[] args) {
        int n = 21;
        HashSet<Integer> set =  new HashSet<>();
        while(n>0)
        {
            int x = n,c = 0;
            while(x>0)
            {
                x/=3;
                c++;
            }
            if(!set.add(c))
                System.out.println(false);
            n -= (int)Math.pow(3,c);
        }
        System.out.println(true);
    }
}
