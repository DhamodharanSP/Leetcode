package LeetCodeEasyProblems;

public class Q463
{
    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int sum = 0;
        for(int i=0;i<grid.length;++i)
        {
            for(int j=0;j<grid[i].length;++j)
            {
                if(grid[i][j]==1)
                {
                    if(i-1 >=0)
                    {
                        int top = grid[i-1][j];
                        if(top == 0) sum += 1;
                    }
                    else sum += 1;
                    if(i+1 < grid.length)
                    {
                        int bottom = grid[i+1][j];
                        if(bottom == 0) sum += 1;
                    }
                    else sum += 1;
                    if(j-1 >= 0)
                    {
                        int left = grid[i][j-1];
                        if(left == 0) sum += 1;
                    }
                    else sum += 1;
                    if(j+1 < grid[i].length)
                    {
                        int right = grid[i][j+1];
                        if(right == 0) sum += 1;
                    }
                    else sum += 1;
                }
            }
        }
        System.out.println(sum);
    }
}
