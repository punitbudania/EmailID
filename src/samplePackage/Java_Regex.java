package samplePackage;

import java.util.Scanner;
import java.util.regex.*;

public class Java_Regex
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String any = "^([a-z]{3})([+_.-]?[0-9a-z]{3,})?([@][0-9a-z]{1,})([.][a-z]{2,})([.][a-z]{2,})?";
		Pattern pattern = Pattern.compile(any,Pattern.MULTILINE);
		System.out.println("Enter Text:");
		Matcher matcher = pattern.matcher(sc.next());
		
		boolean found = false;
		
		while(matcher.find())
		{
			System.out.println("Hurray!! Its a Match");
			found = true;
		}
		
		if(!found)
		{
			System.out.println("No Match Found");
		}
	}
}
