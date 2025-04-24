package LeetCodeEasyProblems;

public class Q941
{
    public static void main(String[] args) {
        int[] arr = {0,3,2,1};
        if(arr.length<3)
            System.out.println("false 1");
        int i;
        for(i=1;i<arr.length-1;++i)
        {
            if(arr[i]>arr[i+1])
                break;
        }
        int j=i;
        for(j=i;j<arr.length-1;++j)
        {
            if(arr[j]<arr[j+1])
                break;
        }
        if(j==arr.length)
            System.out.println("true 1");
        System.out.println("false 2");
    }
}
