package LeetCodeMediumProblems;

public class Q3427
{
    public static void main(String[] args) {
        int[] nums = {2,3,1};
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;++i)
        {
            prefix[i] = prefix[i-1] + nums[i];
        }
        int sum = 0;
        for(int i=0;i<nums.length;++i)
        {
            int l = Math.max(0,i-nums[i]);
            sum += prefix[i];
            if(l-1 >= 0)
                sum -= prefix[l-1];
        }
        System.out.println(sum);
    }
}
