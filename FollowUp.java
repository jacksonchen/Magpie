
/**
 * Write a description of class FollowUp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class FollowUp
{
    private static String line = "aaeaeaae";
    
    
    public static int findString (String str, int start)
    {
        String myString = line.toLowerCase(); // the larger string
        str = str.toLowerCase(); // the character you're searching for
        int psn = myString.indexOf(str, start);
        while (psn < myString.length() && psn >= 0)
        {
            System.out.println(str);
            if (myString.substring(psn-1,psn).equals(str) || myString.substring(psn+1,psn+2).equals(str))
            {
                return -1;
            }
            else
            {
                return psn;
            }
        }
        return -1;
    }
    
    public static void main (String[] args)
    {
        System.out.println(findString("l",0));
        
    }
}