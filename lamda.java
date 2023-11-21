package javaprograms;

interface Drawable
{
	public void draw();
}



public class lamda {

	public static void main(String[] args) {
	
		int width=10;
		//no need to create objects
		Drawable d=() ->
		{
		System.out.println(width);	
		};
		d.draw();
		

	}

}
