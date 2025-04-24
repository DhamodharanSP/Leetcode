package LeetCodeEasyProblems;

public class Q914
{
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2};
        int sum = 0;
        for(int i:arr)
            sum ^= i;
        System.out.println(sum);
    }
}
