package javaprograms;

public class pattern2 {

	public static void main(String[] args) {
	int j,row=6;
		for(int i=0;i<row;i++)
		{
			//for spaces between stars
			for( j=2*(row-i);j>=0;j--)
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
