package LeetCodeEasyProblems;

public class Q3477
{
    public static void main(String[] args) {
        int[] fruits = {3,6,1};
        int[] baskets = {6,4,7};
        int unplaced = 0, c = 0;
        for(int i=0;i<fruits.length;++i)
        {
            for(int j=1;j<fruits.length;++j)
            {
                if(fruits[i]<=baskets[j])
                {
                    baskets[j] = 0;
                    c++;
                    break;
                }
            }
        }
        System.out.println(fruits.length - c);
    }
}
