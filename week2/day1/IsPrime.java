package week2.day1;


public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare Operators
		int a =5;
		boolean flag = false;
		
		// 0 and 1 is not a prime number
		if(a==0|| a==1)
		{
			flag=true;
		}
		
		// Number divisible by any number is not a prime number
		
		for (int i=2; i<=a/2; ++i) {
			if(a%i==0) {
			flag= true;
			break;
				
			}
		}
		  if (flag == false)
		      System.out.println(a + " is a prime number.");
		    else
		      System.out.println(a + " is not a prime number.");
		  }
		}