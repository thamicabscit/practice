package javaprograms;

public class pattern3 {

	public static void main(String[] args) {
	
		int j;
		for(int i=0;i<4;i++)
		{
			//spaces between two stars
			for(j=4-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
