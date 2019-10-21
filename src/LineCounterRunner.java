//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.io.*;
import static java.lang.System.*;  

public class LineCounterRunner
{
   public static void main( String args[] )throws IOException
   {	
       Scanner in  = new Scanner(new File("LineCounter.txt"));
       LineCounter x = new LineCounter();
       while(in.hasNextLine())
       {
           x.setLine(in.nextLine());
           System.out.println(x.getCount());
       }
    }
}