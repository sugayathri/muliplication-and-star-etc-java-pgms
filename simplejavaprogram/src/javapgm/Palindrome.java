package javapgm;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String reverse="";
	Scanner s=new Scanner(System.in);
	System.out.println("enter number:");
		
	String original=s.nextLine();
	int length=original.length();
	for(int i=length-1;i>=0;i--)
	{
	 
		reverse=reverse+original.charAt(i);
		
		
		
	}
	System.out.println(reverse);
	
		if(original.equals(reverse))
		{
			System.out.println("palindrome");
			
		}
		else
			System.out.println("not palindrome");
	}	
		
	}


