//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounter
{
	private String line;

   public OddEvenCounter()
   {
   }

   public OddEvenCounter(String s)
   {
       line = s;
   }

	public void setLine(String s)
	{
            line = s;
	}

	public int getEvenCount()
	{
		int count= 0;
                int space =0;
                for(int i = 0; i<line.length(); i++)
                {
                    if(line.charAt(i)==' '&& space!=0)
                    {
                        String placer =  line.substring(space+1, i);
                        space=i;
                        if(Integer.parseInt(placer)%2==0)
                        {
                            count++;
                        }
                    }
                    else if(line.charAt(i)==' '&& space==0)
                    {
                        String placer =  line.substring(0, i);
                        space=i;
                        if(Integer.parseInt(placer)%2==0)
                        {
                            count++;
                        }
                    }
                }
                if(Integer.parseInt(line.substring(space+1, line.length()))%2==0)
                {
                    count++;
                }
		return count;
	}

	public int getOddCount()
	{
		int count= 0;
                int space =0;
                for(int i = 0; i<line.length(); i++)
                {
                    if(line.charAt(i)==' '&& space!=0)
                    {
                        String placer =  line.substring(space+1, i);
                        space=i;
                        if(Integer.parseInt(placer)%2!=0)
                        {
                            count++;
                        }
                    }
                    else if(line.charAt(i)==' '&& space==0)
                    {
                        String placer =  line.substring(0, i);
                        space=i;
                        if(Integer.parseInt(placer)%2!=0)
                        {
                            count++;
                        }
                    }
                }
                if(Integer.parseInt(line.substring(space+1, line.length()))%2!=0)
                {
                    count++;
                }
		return count;
	}

	public String toString( )
	{
		return "Odd:"+getOddCount()+" Even:"+getEvenCount();
	}
}