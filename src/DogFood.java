//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood
{
   private double amount;

   public DogFood()
   {		
   }

   public DogFood(String line)
   {
		Scanner chopper = new Scanner(line);
		double cups = 0;
                int space = 0;
                for(int i = 0; i<line.length();i++)
                {
                    if(line.charAt(i)==' '&& space ==0)
                    {
                        String x = line.substring(0, i);
                        space=i;
                        int weight = Integer.parseInt(x);
                        if(weight>=2 && weight<=4)
                        {
                            cups += 0.5;
                        }
                        else if(weight>=5 && weight<=7)
                        {
                            cups += 1.0;
                        }
                        else if(weight>=8 && weight<=9)
                        {
                            cups += 1.5;
                        }
                        else if(weight>=10 && weight<=19)
                        {
                            cups += 2.0;
                        }
                        else if(weight>=20 && weight<=39)
                        {
                            cups += 3.5;
                        }
                        else if(weight>=40 && weight<=59)
                        {
                            cups += 4.5;
                        }
                        else if(weight>=60 && weight<=79)
                        {
                            cups += 6.0;
                        }
                        else if(weight>=80)
                        {
                            cups += 7.5;
                        }
                    }
                    else if(line.charAt(i)==' '&& space!=0)
                    {
                        String x = line.substring(space+1, i);
                        space=i;
                        int weight = Integer.parseInt(x);
                        if(weight>=2 && weight<=4)
                        {
                            cups += 0.5;
                        }
                        else if(weight>=5 && weight<=7)
                        {
                            cups += 1.0;
                        }
                        else if(weight>=8 && weight<=9)
                        {
                            cups += 1.5;
                        }
                        else if(weight>=10 && weight<=19)
                        {
                            cups += 2.0;
                        }
                        else if(weight>=20 && weight<=39)
                        {
                            cups += 3.5;
                        }
                        else if(weight>=40 && weight<=59)
                        {
                            cups += 4.5;
                        }
                        else if(weight>=60 && weight<=79)
                        {
                            cups += 6.0;
                        }
                        else if(weight>=80)
                        {
                            cups += 7.5;
                        }
                    }
                }
                if(line.charAt(line.length()-1)!=' ')
                {
                    String x = line.substring(space+1, line.length());
                    int weight = Integer.parseInt(x);
                        if(weight>=2 && weight<=4)
                        {
                            cups += 0.5;
                        }
                        else if(weight>=5 && weight<=7)
                        {
                            cups += 1.0;
                        }
                        else if(weight>=8 && weight<=9)
                        {
                            cups += 1.5;
                        }
                        else if(weight>=10 && weight<=19)
                        {
                            cups += 2.0;
                        }
                        else if(weight>=20 && weight<=39)
                        {
                            cups += 3.5;
                        }
                        else if(weight>=40 && weight<=59)
                        {
                            cups += 4.5;
                        }
                        else if(weight>=60 && weight<=79)
                        {
                            cups += 6.0;
                        }
                        else if(weight>=80)
                        {
                            cups += 7.5;
                        }
                }
                System.out.println("Total cups: "+cups);
                amount = getAmount(cups);
   }

   public double getAmount(double cups)
   {
   	return Math.ceil(cups/60);
   }

	public String toString()
	{
		return "Amount of 10-pounds bags: "+amount;
	}
}