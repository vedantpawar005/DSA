package dsaPrep;

public class Starpattern7 {

	public static void main(String[] args) {
		int a=1;
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
			System.out.println();
			a+=2;
		}
		

	}

}
/*

     *
    ***
   *****
  *******
 *********
 
*/ 
 