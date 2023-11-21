package javaprograms;

public class Factors {

	public static void main(String[] args) {
	
		int num=28;
		int sum=0;
		//if i=0 it will give arithmatic exception
		for(int i=1;i<num;i++)
		{
			//to find factors of 28
			if(num%i==0)
			{
				System.out.println(i);
				//sum all factors of 28
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not perfect number");
		}

	}

}
