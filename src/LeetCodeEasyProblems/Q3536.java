package LeetCodeEasyProblems;

public class Q3536
{
    public static void main(String[] args) {
        int n = 123;
        int[] freq = new int[10];
        while(n>0)
        {
            freq[n%10]++;
            n/=10;
        }
        int[] res = new int[2];
        for(int i=9;i>=0;--i)
        {
            if(freq[i]>0)
            {
                if(res[0]==0)
                    res[0] = i;
                else
                {
                    res[1] = i;
                    break;
                }
                freq[i]--;
                if(freq[i]>0)
                {
                    res[1] = i;
                    break;
                }
            }
        }
        System.out.println(res[0] * res[1]);
    }
}
