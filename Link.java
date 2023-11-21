package javaprograms;

import java.util.LinkedList;
import java.util.List;

public class Link {

	public static void main(String[] args) {
// LinkedList list=new LinkedList();
// list.add(1);
// list.add(2);
// list.add(3);
 LinkedList<Integer> list= new LinkedList<>(List.of(1,2,3,4,5,6,7,8,9,10));
 for(int i=0;i<list.size();i++)
 {
	 if(i%2!=0)
	 {
		System.out.println(i); 
	 }
 }

 
	
	 

	}

}
