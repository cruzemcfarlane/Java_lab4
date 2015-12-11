//Cruze McFarlane
package Lab4;
import java.util.*;
import java.io.*;

public class Glossary
{
    private ArrayList<String> words;
    
    public Glossary()
    {
        words = new ArrayList<String>();
        
        words.add("Excellence");
        words.add("Therefore");
        words.add("Is");
        words.add("An");
        words.add("Habit");
        
        words.add(0,"alpha");
        words.add(1, "We");
        words.add(2, "Are");
        words.add(3, "What");
        words.add(4, "We");
        words.add(5, "Repeatedly");
        words.add(6, "Do");
        
        words.add("alpha");
    }
    
    public Glossary(String nameFile) 
    {
        Scanner scan;
        File myFile;
        String s1;
        words = new ArrayList<String>();
                        
        try
        {
            myFile = new File(nameFile);
            scan = new Scanner(myFile);
            
            while (scan.hasNext())
            {
                s1 = scan.nextLine();
                words.add(s1);
            }
        }
        
        catch(Exception e)
        {
            System.out.println("File not found");
        }
    }
    
    public int occurences(String word)
    {
        int pos = 0, count = 0;
        
        while (pos < words.size())
        {
            if (word.equals(words.get(pos++)))
            {
                count++;
            }
        }
       
        return count;
    }
    
    public int prune(String word)
    {
        int pos = 0, count = 0;
        
        while (pos < words.size())
        {
            int newPos = pos;
            if (word.equals(words.get(pos++)))
            {
                count++;
                words.remove(newPos);
            }
        }
        
        return count++;
    }
    
        
    public String toString() 
    {
        int pos = 0;
        String list;
        
        while (pos < words.size())
        {
            list = words.get(pos++);
            System.out.print(list +"\n");
        }
        
        return "";
    }
}