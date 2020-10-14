package v1ch06.comparator;

import java.util.*;
public class ComparatorTest 
{
    public static void main(String[] args)
    {
        String[] friends = {"Paul", "Marry", "Jay", "zhufengwu"};
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));
    }    
}
class LengthComparator implements Comparator<String>
{
    public int compare(String first, String second)
    {
        return first.length() - second.length();
    }
}