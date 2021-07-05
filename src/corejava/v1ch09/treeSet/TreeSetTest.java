package v1ch09.treeSet;

import java.util.*;

public class TreeSetTest 
{
    public static void main(String[] args)
    {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 9912));
        parts.add(new Item("Yodem", 9912));
        System.out.println(parts);

        NavigableSet<Item> sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}

class Item implements Comparable<Item>
{
    private String description;
    private int partNumber;

    public Item(String aDescription, int aPartNumber)
    {
        this.description = aDescription;
        this.partNumber = aPartNumber;
    }

    public String getDescription()
    {
        return this.description;
    }

    public String toString() //不定义toString方法，打印时会打印对象细节
    {
        return "[description=" + this.description + ", partNumber="
                +partNumber + "]";
    }
    

    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description) &&
                partNumber == other.partNumber;
    }

    public int hashCode()
    {
        return Objects.hash(description, partNumber);
    }

    public int compareTo(Item other)
    {
        int diff = Integer.compare(partNumber, other.partNumber);
        return diff != 0 ? diff : description.compareTo(other.description);
    }
}