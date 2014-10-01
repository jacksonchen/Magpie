
/**
 * Write a description of class FollowUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FollowUp
{
    private String line = "aabcca";
    private static int findString(String str, int start)
    {
        int psn = line.indexOf(str, start);
        String before = "";
        String after = "";
        while (psn >= 0)
        {
            if (psn == 0)
            {
                after = str.substring(1, 2);
            }
            else if (psn == str.length() - 1)
            {
                before = str.substring(str.length() - 2, str.length() - 1);
            }
            else if (psn > 0)
            {
                before = str.substring(psn - 1, psn);
                after = str.substring(psn + 1, psn + 2);
            }
            
            if (before != str || after != str)
            {
                return psn;
            }
            else 
            {
                return -1;
            }
        }
        return -1;
    }
    
    public static void main (String[] args)
    {
        System.out.println(findString("a", 2));
    }
}
