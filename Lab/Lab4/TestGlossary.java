//Cruze McFarlane 620040546
package Lab4;
import java.io.*;
import java.util.*;

public class TestGlossary
{
    public static void main(String[] arg) throws IOException
    {
        Glossary myGlossary = new Glossary("glossary.txt");
        
        System.out.println("Array 'BEFORE' Pruning:\n");
        System.out.println(myGlossary.toString());
        System.out.println("Occurances of 'encapsulation': " +myGlossary.occurences("encapsulation")
                            +"\n"); //Adjust item in occurences  
        
        System.out.println("Item to be pruned 'motor': " +myGlossary.prune("motor") //Adjust item in prune
                           +" (time[s] removed)\n\n");
        System.out.println("Array 'AFTER' Pruning:\n");                    
        System.out.println(myGlossary.toString());
    }
}