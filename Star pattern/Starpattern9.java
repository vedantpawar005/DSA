package dsaPrep;

public class Starpattern9 {

	public static void main(String[] args) {
		int a=1,b=9;
		for(int i=5;i>0;i--) 
		{
			for(int space=0;space<i;space++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=a;j++) 
			{
				System.out.print("*");
			}
			a+=2;
			System.out.println();
		}
		for(int i=0;i<5;i++) 
		{
			for(int space=0;space<=i;space++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=b;j++) 
			{
				System.out.print("*");
			}
			b-=2;
			System.out.println();
		}

	}

}


/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *


*/
