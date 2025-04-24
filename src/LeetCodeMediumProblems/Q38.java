package LeetCodeMediumProblems;

public class Q38
{
    static String func(int n,String s)
    {
        if(n==1)
            return "1";
        else
        {
            s = func(n-1,s);
            StringBuilder str = new StringBuilder();
            char prev = s.charAt(0);
            int c = 1;
            for(int i=1;i<s.length();++i)
            {
                char cur = s.charAt(i);
                if(cur==prev)
                    c++;
                else
                {
                    str.append(c);
                    str.append(prev);
                    prev = cur;
                    c = 1;
                }
            }
            str.append(c);
            str.append(prev);
            return str.toString();
        }
    }
    public static void main(String[] args) {
        int n = 10;
        String s = "";
        System.out.println(func(n,s));
    }
}
