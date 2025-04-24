package WeeklyChallenge;

public class Feb02
{
    public static void main(String[] args) {
        int[] freq = new int[26];
        String s = "aaaaabbc";
        for(int i=0;i<s.length();++i)
        {
            freq[s.charAt(i)-'a']++;
        }
        int oddMax = 0;
        int evenMin = Integer.MAX_VALUE;
        for(int i=0;i<26;++i)
        {
            if (freq[i] % 2 == 0 && freq[i] != 0) {
                evenMin = Math.min(evenMin, freq[i]);
            } else {
                oddMax = Math.max(oddMax, freq[i]);
            }
        }
        System.out.println(oddMax-evenMin);
    }
}
