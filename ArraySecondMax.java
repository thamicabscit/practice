package javaprograms;

public class ArraySecondMax {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5,6,7};
		
		//first sorting the array using swap method
		//take 2 numbers as i and j to check second max
		
		//use Array.sort(array) method to sorting
		
		for(int i=0;i<array.length;i++)
		{
			//i+1 must
			for(int j=i+1;j<array.length;j++)
			{
				//to sort ascending to descending order
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		//after sorting print the second element from the end of the array
		System.out.println("second max number :"+array[array.length-2]);
		
		
		

	}

}
