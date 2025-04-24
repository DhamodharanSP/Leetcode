package LeetCodeMediumProblems;

import java.util.Arrays;

public class Q2657
{
    public static void main(String[] args) {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};
        int[] freq = new int[51];
        int[] res = new int[A.length];

        for(int j=0;j<B.length;++j)
        {
            freq[A[j]]++;
            freq[B[j]]++;
            int c = 0;
            for(int k=1;k<=A[j];++k)
            {
                if(freq[k]==2)
                    c++;
            }
            res[j] = c;
        }
        System.out.println(Arrays.toString(res));
    }
}
