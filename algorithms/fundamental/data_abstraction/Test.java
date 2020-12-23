package fundamental.data_abstraction;

import edu.princeton.cs.introcs.StdOut;

import java.util.Locale;

public class Test
{
    public static void main(String[] args)
    {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";

        StdOut.println(string1);
        StdOut.println(string2);

        String s = "hello, World";
        s.toUpperCase();
        s.substring(6, 11);
        StdOut.println(s);
    }
}



