package javaprograms;

//public class fibonacci {
//
//	public static void main(String[] args) {
//	 int n1=0,n2=1,n3,count=10;
//	 System.out.print(n1+" "+n2);
//	 for(int i=2;i<count;++i)
//	 {
//		 n3=n1+n2;
//		 n1=n2;
//		 n2=n3;
//		
//		 System.out.print(n3+" ");
//	 }
//
//	}
//
//}
//n1,n2,n3
//0, 1, 1 , 2
//   n1,n2,n3


//passing parameter 
//public class fibonacci
//{
//	
//	static int fibo(int count)
//	{
//		int n1=0,n2=1,n3;
//		//equals to must
//		for(int i=2;i<=count;i++)
//		{
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//		}
//		return n2;
//		
//	}
//	
//	public static void main(String[] args)
//	{
//	
//		
//		System.out.println(fibo(7));
//	
//		
//	}
//}
		
		
	//between range
public class fibonacci
{
	public static void main(String[] args)
	{
		
	int n=10,m=20;
		  int a = 0, b = 1;
	        while (a <= n) {
	            if (a >= m)
	            {
	                System.out.println(a);
	            }
	            int c = a + b;
	            a = b;
	            b = c;

	}
		 
	}
}
	






	
//counting digits
//public class fibonacci
//{
//	public static void main(String[] args)
//	{
//		int count=0;
//		int num=345678;
//		while(num!=0)
//		{
//			num=num/10;
//			count++;
//		}
//		System.out.println(count);
//	}
//}
		
		
		
		
		
		
		
	
