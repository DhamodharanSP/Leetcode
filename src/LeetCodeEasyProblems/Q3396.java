package LeetCodeEasyProblems;

import java.util.HashSet;

public class Q3396
{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,3,3,5,7};
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        int len = nums.length;
        int i = 0, res = 0;
        while(set.size()!=len && len>0)
        {
            if(i < nums.length) set.remove(nums[i]);
            if(i+1 < nums.length) set.remove(nums[i+1]);
            if(i+2 < nums.length) set.remove(nums[i+2]);
            len -= 3;
            res++;
            i+=3;
        }
        System.out.println(res);
    }
}
