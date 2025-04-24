package LeetCodeEasyProblems;

import java.util.Arrays;

public class Q566
{
    public static void main(String[] args) {

        int[][] mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int r = 2, c = 6;
        int[][] res = new int[r][c];
        for(int i=0;i<4;++i)
        {
            for(int j=0;j<3;++j)
            {
                res[(i+j)/c][(i+j)%c] = mat[i][j];
            }
        }
        System.out.println(Arrays.deepToString(res));
    }
}
