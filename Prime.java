package javaprograms;

import java.util.Scanner;

//public class Prime {
//
//	public static void main(String[] args) {
//	
//		int num=6;
//		//boolean default value
//		boolean flag=false;
//		//range between 2 and half of the given number 
//		//because any number is not divisible by its half
//		//checking num is divisible by each number from 2(tables)
//		for(int i=2;i<=num/2;i++)
//		{
//			if(num%i==0)
//			{
//			 flag=true;
//				break;
//			}
//		
//		}
//		if(!flag)
//		{
//			System.out.println("prime number");
//		}
//		else
//		{
//			System.out.println("not a prime");
//		}
//
//	}
//
//}



// first n numbers
//public class Prime
//{
//	
//	static boolean isPrime(int n)
//	{
//		for(int i=2;i<n/2;i++)
//		{
//			if(n%i==0)
//			{
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	
//	public static void main(String args[])
//	{
//		int num=100;
//		//from 50 to 100 range
//		//i=50
//		for(int i=0;i<=num;i++)
//		{
//			if(isPrime(i))
//			{
//				System.out.println(i);
//			}
//			
//		}
//		
//	}
//}


//negative numbers 
//public class Prime
//{
//	public static void main(String args[])
//	{
//		int n=33;
//		boolean isPrime=true;
//		// 0,1,negative numbers are not prime numbers
//		if(n<2)
//		{
//			isPrime=false;
//		}
//		else
//		{
//			for(int i=2;i<=n/2;i++)
//			{
//				if(n%i==0)
//				{
//					isPrime=false;
//					//to stop the loop when the num is not prime
//					break;
//				}
//				
//			}
//		}
//	String result=isPrime?"Prime":"Not Prime";
//	System.out.println(result);
//	}
//}


//prime without method
//public class Prime
//{
//	public static void main(String args[])
//	{
//		int n=25;
//		//0 and 1 are not prime numbers so start with 2 till given number 
//		for(int j=2;j<=n;j++)
//		{
            //count variable should be within inner for loop only
//			int count=0;
//			//prime number is divisible only 1 and itself
//			//so here 1 to that number itself
//			//if i=2 , 2 is less or equal to j(2)
//			//if i=3, 3 is not less than j(2) 
//			//so the loop stops there , for checking number 2 is prime 
//			//it will check till that number only (j)
//			for(int i=1;i<=j;i++)
//			{
//				//2%1 remainder is 0 so it is count 1
//				//2%2 remainder is 0 so it is count 2
//				
//				if(j%i==0)
//				{
//					count++;
//				}
//			}
//			//count =2 means it is prime number
//			//here count is divisor, prime number has only 2 divisors
//		if(count==2)
//		{
//			System.out.print(j+" ");
//		}
//		}
//		
//		
//		
//		
//		
//}
//}
	
//prime numbers with index 
//public class Prime
//{
//	public static void main(String args[])
//	{
//
//
//		        int n = 10; // Change this to find the first n prime numbers
//
//		        int count = 0;
//
//		        for (int num = 2; count < n; num++) {
//		            boolean isPrime = true;
//
//		            // Check if num is prime
//		            for (int i = 2; i <= num/2; i++) {
//		                if (num % i == 0) {
//		                    isPrime = false;
//		                    break;
//		                }
//		            }
//
//		            // Print num and index if it's prime
//		            if (isPrime) {
//		                System.out.println("Prime number " + num + " at index " + count);
//		                count++;
//		            }
//		        }
//		    }
//		}




//to find index of particular number
//public class Prime {
//
//    public static void main(String[] args) {
//
//        int n = 20; // Change this to find the first n prime numbers
//        int primeToFind = 3; // Change this to find the index of a particular prime number
//
//        int count = 0;
//        int index = -1;
//
//        for (int num = 2; num < n; num++) 
//        {
//            boolean isPrime = true;
//
//            // Check if num is prime
//            for (int i = 2; i <= num/2; i++)
//            {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            // Update index if num is the prime we're looking for
//            if (isPrime && num == primeToFind)
//            {
//                index = count;
//            }
//
//            count++;
//            if(isPrime)
//            {
//            	System.out.println(num+" ");
//            	
//            }
//        }
//
//        if (index == -1) {
//            System.out.println(" "+"The number " + primeToFind + " is not in the list of first " + n + " prime numbers.");
//        } else {
//            System.out.println(" "+"The index of " + primeToFind + " in the list of first " + n + " prime numbers is " + index);
//        }
//    }
//}



//to find element based on index
//public class Prime {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the index of the prime number to find: ");
//        int index = input.nextInt();
//
//        int count = 0, num = 2;
//        int[] primes = new int[index + 1]; // store prime numbers in an array
//
//        // it will generate prime numbers based on the given index only
//        while(count <= index)
//        {
//            boolean isPrime = true;
//
//            for(int i = 2; i <= num / 2; i++)
//            {
//                if(num % i == 0)
//                {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if(isPrime)
//            {
//                primes[count] = num; // add prime number to array
//                count++;
//                
//                System.out.println(num); //to print prime number till user given index
//                
//            }
//           
//            num++;
//         
//        }
//
//     
//     
//        System.out.println("The prime number at index " + index + " is " + primes[index]);
//    }
//    
//}





//to find largest prime number
//public class Prime {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the value of n: ");
//        int n = input.nextInt();
//
//        int largestPrime = 2;
//        int count = 0, num = 2;
//
//        while(count < n) {
//            boolean isPrime = true;
//
//            for(int i = 2; i <= num / 2; i++)
//            {
//                if(num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if(isPrime) {
//                largestPrime = num;
//                count++;
//            }
//
//            num++;
//        }
//
//        System.out.println("The largest prime number is " + largestPrime);
//       
//    }
//}



//to find second largest prime number
//public class Prime {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the value of n: ");
//        int n = input.nextInt();
//
//        int largestPrime = 2;
//        int secondLargestPrime = 2;
//        int count = 0, num = 2;
//
//        while(count < n) {
//            boolean isPrime = true;
//
//            for(int i = 2; i <= num / 2; i++) {
//                if(num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if(isPrime) {
//                if(num >= largestPrime) {
//                    secondLargestPrime = largestPrime;
//                    largestPrime = num;
//                }
//                else if(num >= secondLargestPrime) {
//                    secondLargestPrime = num;
//                }
//                count++;
//            }
//
//            num++;
//        }
//
//        System.out.println("The second largest prime number is " + secondLargestPrime);
//    }
//}


public class Prime
{
	public static void main(String args[])
	{
		//to return -1 because the number to be find is not found in the prime series
		int index=-1;
		//the number to find 
		int find=3;
		//10 prime numbers to be printed
		int n=10;
		//to add each prime into an array so use count from 0 (array[0])
		int count=0;
		//first prime number will be 2
		int num=2;
		//to create an array 
		int[] primes=new int[n];
		int sum=0;
		//the loop will execute till n
		while(count < n )
		{
			//isPrime must be the local variable
			boolean isPrime=true;
			for(int i=2;i<=num/2;i++)
			{
				
				if(num%i==0)
				{
					isPrime=false;
					break;
				}
				
			}
			if(isPrime)
			{
				//to add each prime into array(array[0]=prime)
			 primes[count]=	num;
			 //to increase from 0 to 1 index (array[1])
			 count++;
				
			}
			//if the number to be find is a prime number(num) and isPrime is true
			
			if(isPrime&&num==find)
			{
				//then the current count will be the index
				index=count;
			}
			//to increase the num value from 2 to 3
			num++;
		}
		//to traverse the array elements
		for(int j:primes)
		{
			if(j%2==0)
			{
				System.out.println("only even prime number"+j);
			}
		
			System.out.print(j+" "); 
			sum+=j;
			
		}
	
		System.out.println("the sum of all elements"+sum);
		System.out.println("the largest prime number is"+primes[n-1]);
		System.out.println("the second largest prime number is"+primes[n-2]);
		System.out.println("the number at given index is:"+primes[7]);
		if(index==-1)
		{
			System.out.println("number is not found");
		}
		else
		{
			System.out.println("the number found at index"+index);
		}
		
	
	}
}
		
		
		
		
		
	
	
