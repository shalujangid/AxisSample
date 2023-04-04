import java.util.HashMap;
import java.util.Scanner;

public class LongestSubString {
    public void findLongestSubstring()
    {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int i,n = str.length(),st = 0,currlength = 0,strMaxlen = 0,stIndex = 0;
        HashMap<Character,Integer> hash = new HashMap<Character,Integer> ();
        hash.put(str.charAt(0), 0);

        for (i = 1; i < n; i++)
        {
            if (!hash.containsKey(str.charAt(i)))
            {
                hash.put(str.charAt(i), i);
            }
            else
            {
                if (hash.get(str.charAt(i)) >= st)
                {
                    currlength = i - st;
                    if (strMaxlen < currlength)
                    {
                        strMaxlen = currlength;
                        stIndex = st;
                    }
                    st = hash.get(str.charAt(i)) + 1;
                }
                hash.replace(str.charAt(i), i);
            }
        }
        if (strMaxlen < i - st)
        {
            strMaxlen = i - st;
            stIndex = st;
        }
        System.out.println(str.substring(stIndex, stIndex + strMaxlen));

    }

    public static void main(String[] args) {
        LongestSubString l= new LongestSubString();
        l.findLongestSubstring();
    }
}
