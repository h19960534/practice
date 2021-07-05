package v1ch09.iterator;

import java.util.*;

public class RemoveTest 
{
    public static void main(String[] args)
    {
        
        Collection<String> c = new LinkedList<String>();
        for (int i = 1; i < 10; i++)
        { c.add(String.valueOf(i));}
        Iterator<String> it = c.iterator();
        it.next();
        c.remove(String.valueOf(7)); 
               
        for (String value : c)
            System.out.println(value);
        System.out.println(c.size());

    }
}