package LeetCodeEasyProblems;

public class Q3402
{
    public static void main(String[] args) {
        int[][] grid = {{0,0},{0,0}};
        int sum = 0;
        for(int i=1;i<grid.length;++i)
        {
            for(int j=0;j<grid[i].length;++j)
            {
                if(grid[i][j]<grid[i-1][j])
                {
                    sum += (grid[i-1][j] - grid[i][j] + 1);
                    grid[i][j] = grid[i-1][j] + 1;
                }
            }
        }
        System.out.println(sum);
    }
}
