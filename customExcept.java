package practice;

import java.util.Scanner;


class InvalidUserException extends Exception
{
	InvalidUserException(String msg)
	{
		super(msg);
	}
}
class ATM1
{
	private int accountNum=12345;
	private int password=1122;
	private int accNum;
	private int pwd;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the account Number");
		accNum=scan.nextInt();
		System.out.println("Enter the password");
		pwd=scan.nextInt();
	}
	public void verify() throws InvalidUserException
	{
		if(accountNum==accNum && password ==pwd)
		{
			System.out.println("Collect your cash");
			System.out.println("Transaction sucessful!");
		}
		else
		{
			/*
			 * InvalidUserException iue=new InvalidUserException();
			 * System.out.println("Invalid credentials"); throw iue;
			 */
			throw new InvalidUserException("Invalid credentials! ");
		}
	}
}
class Bank
{
	public void initiate()
	{
		ATM1 a=new ATM1();
		try
		{
		
		a.input();
		a.verify();
		}
		catch(InvalidUserException e)
		{
			try
			{
				System.out.println(e.getMessage());
			a.input();
			a.verify();
			}
			
			catch(InvalidUserException f)
			{
				try
				{
					System.out.println(f.getMessage());
					a.input();
					a.verify();
				}
				catch(InvalidUserException g)
				{
					System.out.println("Card is blocked ");
				     System.exit(0);
				}
				
			}
		}
	}
}

	
public class CustomExcep {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.initiate();


	}

}
