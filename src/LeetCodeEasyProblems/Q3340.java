package LeetCodeEasyProblems;

public class Q3340
{
    public static void main(String[] args) {
        String num = "1111111111";//8558
        int odd = 0, even = 0;
        boolean flag = false;
        if(num.length()%2==1)
            flag = true;
        if(flag)
        {
            for(int i=0;i<num.length()/2 +1;++i)
            {
                if(i%2==0 && i!=num.length()-1-i)
                    even += ((num.charAt(i)-'0') + (num.charAt(num.length()-1-i)-'0'));
                else if(i%2==0 && i==num.length()-1-i)
                    even += (num.charAt(i)-'0');
                if(i%2==1 && i!=num.length()-1-i)
                    odd += ((num.charAt(i)-'0') + (num.charAt(num.length()-1-i)-'0'));
                else if(i%2==1 && i==num.length()-1-i)
                    odd += (num.charAt(i)-'0');
            }
        }
        else
        {
            for(int i=0;i<num.length()/2;++i)
            {
                if(i%2==0 && i!=num.length()-2-i)
                    even += ((num.charAt(i)-'0') + (num.charAt(num.length()-2-i)-'0'));
                else if(i%2==0 && i==num.length()-2-i)
                    even += (num.charAt(i)-'0');
                if(i%2==1 && i!=num.length()-i)
                    odd += ((num.charAt(i)-'0') + (num.charAt(num.length()-i)-'0'));
                else if(i%2==1 && i==num.length()-i)
                    odd += (num.charAt(i)-'0');
            }
        }

        System.out.println(odd+" "+even);
    }
}
