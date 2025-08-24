package dsaPrep;

public class Starpattern8 {

	public static void main(String[] args) 
	{
		int a=9;
		for(int i=0;i<5;i++) 
		{
			for(int space=0;space<i;space++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=a;j++) 
			{
				System.out.print("*");
			}
			a-=2;
			System.out.println();
		}

	}

}
/*

*********
 *******
  *****
   ***
    *
    
    
    
 */   