package v2ch01.streams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
//import java.util.Arrays;
import java.util.stream.Stream;


public class CountLongWords
{
    public static void main(String[] args) throws IOException
    {
        String contents = new String(Files.readAllBytes(
                Paths.get("D:\\corejava\\gutenberg\\alice30.txt")), StandardCharsets.UTF_8
        );
        // List<String> words = Arrays.asList(contents.split("\\PL+"));
        Stream<String> words = Stream.of(contents.split("\\PL+"));


        long count;
//        for (String w : words) if (w.length() > 12) count++;
//        System.out.println(count);
//
//        count = words.stream().filter(w -> w.length() > 12).count();
//        System.out.println(count);
//
//        count = words.parallelStream().filter(w -> w.length() > 12).count();
//        System.out.println(count);
        count = words.filter(w -> w.length() > 12).count();
        System.out.println(count);
    }
}
