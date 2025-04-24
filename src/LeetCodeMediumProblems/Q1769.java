package LeetCodeMediumProblems;

import java.util.Arrays;

public class Q1769
{
    public static void main(String[] args) {
        String boxes = "110";
        int[] res = new int[boxes.length()];
        int len = boxes.length();

        int[] right = new int[len];
        int[] left = new int[len];

        int l = (int)(boxes.charAt(len-1)-'0'), r = (int)(boxes.charAt(0)-'0');
        for(int i=1;i<len;++i)
        {
            right[i] += right[i-1] + r;
            r += (int)(boxes.charAt(i)-'0');
        }
        for(int i=len-2;i>=0;--i)
        {
            left[i] += left[i+1] + l;
            l += (int)(boxes.charAt(i)-'0');
        }

        for(int i=0;i<len;++i)
        {
            res[i] = right[i] + left[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
