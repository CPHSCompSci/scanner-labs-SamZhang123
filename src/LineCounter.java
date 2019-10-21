//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class LineCounter
{
   private String line;

   public LineCounter()
   {
    setLine("");
   }

   public LineCounter(String s)
   {
       this.line = s;
   }

    public void setLine(String s)
	{
            this.line=s;
	}

	public int getCount()
	{
            int count=0;
            for(int i=0; i<line.length();i++)
            {
                if(line.charAt(i)==' ')
                {
                     count++;
                }
            }
            if(line.charAt(line.length()-1)==' ')
            {
                return count;
            }
            return count+1;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return getLine();
	}
}