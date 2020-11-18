package v2ch02.path;

import java.nio.file.*;

public class PathTest 
{
    public static void main(String[] args)
    {
        Path p = Paths.get("D:\\study\\fred\\myprog");
        Path r = Paths.get("D:\\study\\fred");
        Path q = p.relativize(r);
        
        System.out.println(q);
        

        

    }
}