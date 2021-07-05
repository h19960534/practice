package v1ch08.pair2;

import java.time.*;

/**
 * @version 1.02 2015-06-21
 * @author Cay Hortsmann
 */
public class PairTest2 
{
    public static void main(String[] args)
    {
        LocalDate[] birthdays = new LocalDate[3];
        birthdays[0] = LocalDate.of(1906, 12, 9); // G.Hopper
        birthdays[1] = LocalDate.of(1815, 12, 10);
        birthdays[2] = LocalDate.of(1903, 12, 3);
               
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}

class ArrayAlg
{
    /**
     * Get the minimum and maximum of an array of objects of type T
     * @param a an array of objects of type T
     * @return a pair with the min and max value, or null if a is null
     * or empty
     */
    
    public static <T extends Comparable<? super T>> Pair<T> minmax(T[] a)
    {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for(T value : a)
        {
            if (min.compareTo(value) > 0) min = value;
            if (max.compareTo(value) < 0) max = value;
        }
        return new Pair<T>(min, max);
    }
}

class Pair<T> 
{
    private T first;
    private T second;

    public Pair() { first = null; second = null;}
    public Pair(T first, T second)
    {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return this.first; }
    public T getSecond() { return this.second; }

    public void setFirst(T newValue) { this.first = newValue;}
    public void setSecond(T newValue) { this.second = newValue;}
}