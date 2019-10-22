//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.io.*;

public class DogFoodRunner
{
	public static void main(String[] args)throws IOException
	{
            Scanner in = new Scanner(new File("DogFood.txt"));
            DogFood x;
            while(in.hasNextLine())
            {
                x = new DogFood(in.nextLine());
                System.out.println(x.toString());
            }
	}
}