package dsaPrep;

public class Starpattern11 {

	public static void main(String[] args) 
	{
		int p=0;
	for(int i=0;i<5;i++) 
	{
		if(i%2==0) 
		{
			p=0;
		}
		else 
		{
			p=1;
		}
		for(int j=0;j<=i;j++) 
		{
			if(p==0) 
			{
				p=1;
				System.out.print(p+" ");
			}
			else 
			{
				p=0;
				System.out.print(p+" ");
			}
		}
		
		System.out.println();
	}	

	}

}

/*
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
*/