//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;

public class OddEvenCounterRunner
{
   public static void main(String args[])throws IOException
   {
       Scanner in = new Scanner(new File("OELine.txt"));
       OddEvenCounter x = new OddEvenCounter();
       while(in.hasNextLine())
       {
           x.setLine(in.nextLine());
           System.out.println(x.toString());
       }
   }
}