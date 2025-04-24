package LeetCodeEasyProblems;

public class Q1342
{
    public static void main(String[] args) {
        int num = 14;
        int res = 1;
        while(num>1)
        {
            if(num%2==1)
                res++;
            num/=2;
            res++;
        }
        System.out.println(res);
    }
}
