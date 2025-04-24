package LeetCodeEasyProblems;

public class Q3105
{
    public static void main(String[] args) {
        int[] nums = {1,4,3,3,2};
        int incMax = 1, decMax = 1;
        int inc = 1,dec = 1;
        int prev = nums[0];
        for(int i=1;i<nums.length;++i)
        {
            int cur = nums[i];
            if(prev < cur)
            {
                inc++;
                decMax = Math.max(decMax,dec);
                incMax = Math.max(incMax,inc);
                dec = 1;
                prev = cur;
            }
            else if(prev > cur)
            {
                dec++;
                incMax = Math.max(incMax,inc);
                decMax = Math.max(decMax,dec);
                inc = 1;
                prev = cur;
            }
            else
            {
                inc = 1;
                dec = 1;
            }
        }
        System.out.println(Math.max(incMax,decMax));
    }
}
