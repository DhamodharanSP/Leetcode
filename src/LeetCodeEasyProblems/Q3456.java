package LeetCodeEasyProblems;

public class Q3456
{
    public static void main(String[] args) {
        String s = "aaaaaa";
        int k = 3;
        int c = 0;
        for(int i=0;i<s.length();++i)
        {
            char cur = s.charAt(i);
            c++;
            if(i!=0)
            {
                if(cur == s.charAt(i-1))
                {
                    if(c==k)
                    {
                        if(i<s.length()-1)
                        {
                            if(cur == s.charAt(i+1))
                                c=0;
                            else
                                System.out.println(true);
                        }
                        else {
                            if(cur != s.charAt(i-k))
                                System.out.println(true);
                        }
                    }
                }
                else
                {
                    c = 1;
                }
            }
            if(c==k)
            {
                if(i<s.length()-1)
                {
                    if(cur == s.charAt(i+1))
                        c=1;
                    else
                        System.out.println(true);
                }
                else
                {
                    if(c==k)
                    {
                        if(i-k >= 0 && cur != s.charAt(i-k))
                            System.out.println(true);
                    }

                }
            }


        }
        if(c==k)
        {
            if(s.length()-k >= 0 && s.charAt(s.length()-1) != s.charAt(s.length()-k))
                System.out.println(true);
        }
        System.out.println(false);
    }
}
