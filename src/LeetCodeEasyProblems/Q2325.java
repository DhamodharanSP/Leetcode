package LeetCodeEasyProblems;

import java.util.HashMap;
import java.util.HashSet;

public class Q2325
{
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        HashMap<HashSet<Character>,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        int c = 0;
        for(int i=0;i<key.length();++i)
        {
            if(key.charAt(i)!=' ')
            {
                set.add(key.charAt(i));
                c++;
            }
            if(c==25)
                break;
        }
        System.out.println(map);
        StringBuilder str = new StringBuilder();
        for(int i=0;i<message.length();++i)
        {
            str.append(map.get(message.charAt(i)));
        }
        System.out.println(str.toString());
    }
}
