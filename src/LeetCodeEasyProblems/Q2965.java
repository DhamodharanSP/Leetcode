package LeetCodeEasyProblems;

import java.util.Arrays;

public class Q2965
{
    public static void main(String[] args) {
        int[][] grid = {{1,3},{2,2}};
        int len = grid.length;
        int[] arr = new int[len*len + 1];
        for(int i=1;i<len*len + 1;++i)
        {
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<len;++i)
        {
            for(int j=0;j<len;++j)
                arr[grid[i][j]]--;
        }
        System.out.println(Arrays.toString(arr));
        int repeat = 0, miss = 0;

        for(int i=1;i<len*len + 1;++i)
        {
            if(arr[i]==0)
                repeat = i;
            else if(arr[i]==2)
                miss = i;
        }
        System.out.println(repeat+" "+miss);
    }
}
