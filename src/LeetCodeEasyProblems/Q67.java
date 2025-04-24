package LeetCodeEasyProblems;

public class Q67
{
    public static void main(String[] args) {
        String a = "1010", b = "1011";

        // 100110
        //  10001
        // 110111

        int i = a.length()-1, j = b.length()-1;
        StringBuffer s = new StringBuffer();

        int carry = 0;
        while(i>=0 && j>=0)
        {
            int n = a.charAt(i--)-'0';
            int m = b.charAt(j--)-'0';
            int res = n + m + carry;
            if(res == 1 || res == 0)
                s.append(res);
            else if(res == 2)
            {
                s.append(0);
                carry = 1;
            }
            else
            {
                s.append(1);
                carry = 1;
            }
        }
        while(i>=0)
        {
            int n = a.charAt(i--)-'0';
            int res = n + carry;
            carry = 0;
            if(res == 1 || res == 0)
                s.append(res);
            else if(res == 2)
            {
                s.append(0);
                carry = 1;
            }
        }
        while(j>=0)
        {
            int m = b.charAt(j--)-'0';
            int res = m + carry;
            carry = 0;
            if(res == 1 || res == 0)
                s.append(res);
            else if(res == 2)
            {
                s.append(0);
                carry = 1;
            }
        }
        if(carry == 1) s.append(1);
        System.out.println(s.reverse());
    }
}
