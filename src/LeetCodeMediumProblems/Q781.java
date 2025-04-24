package LeetCodeMediumProblems;

import java.util.HashMap;

public class Q781
{
    public static void main(String[] args) {
        int[] answers = {1,1,2};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:answers)
        {
            if(map.getOrDefault(i,-1)==-1)
                map.put(i,1);
            else
                map.put(i,map.get(i)+1);
        }

        int sum = 0;

        System.out.println(map);

        for(int i:map.keySet())
        {
            int freq = map.get(i);
            int occ = (freq/(i+1));
            int it = (i+1);
            sum += (occ * it);
            if(freq%(i+1) != 0)
                sum += i+1;
        }
        System.out.println(sum);

    }
}
