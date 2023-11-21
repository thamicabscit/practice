package javaprograms;

public class ArrayIndex {

	public static int findindex(int n)
	{
		int[] array= {1,2,3,4,5,6};
		for(int i:array)
		{
			if(array[i]==n)
			{
				return i;
			}
			
		}
		return -1;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
		System.out.println("index:"+findindex(6));

	}

}
