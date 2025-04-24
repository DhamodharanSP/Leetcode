package LeetCodeEasyProblems;

public class Q3014
{
    public static void main(String[] args) {
        String word = "xycdefghij";
        int res = 0;
        int len = word.length();
        int i = 1;
        while(len>0)
        {
            res += ((len<9)?len%10:9) * i;
            i++;
            len-=9;
        }
        System.out.println(res);
    }
}
