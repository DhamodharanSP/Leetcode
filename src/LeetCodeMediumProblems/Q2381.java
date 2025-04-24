package LeetCodeMediumProblems;

import java.util.Arrays;

public class Q2381
{
    public static void main(String[] args) {
//        String s = "iaozjb";
//        int[][] shifts = {{0,4,0},{0,2,1},{1,3,1},{0,4,1},{4,4,1},{2,3,0},{5,5,0},{3,3,0},{2,3,0},{5,5,1},{5,5,1},{5,5,0}};
        String s = "dztz";
        int[][] shifts = {{0,0,0},{1,1,1}};
        char[] arr = s.toCharArray();
        int[] freq = new int[s.length()];
        //((arr[j] + 1 - 97) % 26)+97
        for(int i=0;i<shifts.length;++i)
        {
            int l = shifts[i][0], r = shifts[i][1], dir = shifts[i][2];
            for(int j=l;j<=r;++j)
            {
                if(dir == 1)
                    freq[j]++;
                else
                    freq[j]--;
            }
        }
        System.out.println(Arrays.toString(freq));
        for(int k=0;k<s.length();++k)
        {
            arr[k] = (char)((((arr[k] + freq[k])-97)%26)+97);
        }
        System.out.println(Arrays.toString(arr));
    }
}
