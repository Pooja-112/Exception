

import java.util.Scanner;

class UnderAgeException extends Exception
{
	UnderAgeException(String msg)
	{
		super(msg);
	}
}
class OverAgeException extends Exception
{
	
	OverAgeException(String msg)
	{
		super(msg);
	}
}

class LApp
{
   private int age;
   
   public void input()
   {
	   Scanner scan=new Scanner(System.in);
	   
	    System.out.println("Dear kindly enter your age to check eligbility");
	    age =scan.nextInt();  
   }
   public void verify() throws OverAgeException, UnderAgeException
   {
	   if(age>=18 && age<=60)
	   {
		   System.out.println("You're eligible");
	   }
	   else if(age < 18)
	   {
		   throw new UnderAgeException("sorry! you are below 18 not eligible");
	   }
	   else if(age > 60)
	   {
		   throw new OverAgeException("sorry! you are above 60 not eligible ");
		   
	   }
   }

}

class RTO
{
	void initiate()
	{
		LApp la=new LApp();
		try
		{
			
			la.input();
			la.verify();
		}
		catch(UnderAgeException a)
		{
			System.out.println(a.getMessage());
			try
			{
				la.input();
			    la.verify();
				
			}
			catch(UnderAgeException b)
			{
				System.out.println(a.getMessage());
				System.out.println("INVALID");
				System.exit(0);
			}
			catch(OverAgeException c)
			{
				System.out.println(a.getMessage());
				System.out.println("INVALID");
				System.exit(0);
			}
		}
		catch(OverAgeException oae)
		{
			System.out.println(oae.getMessage());
			try
			{
				la.input();
			    la.verify();
				
			}
			catch(UnderAgeException b)
			{
				System.out.println("INVALID");
				System.exit(0);
			}
			catch(OverAgeException c)
			{
				System.out.println("INVALID");
				System.exit(0);
			}
		}
	}
}


public class LaunchRto {
	
	public static void main(String[] args) {
		
        RTO r=new RTO();
        r.initiate();
        
	}

}


