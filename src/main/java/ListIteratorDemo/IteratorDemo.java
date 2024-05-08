package ListIteratorDemo;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{
public static void main(String[] args) 
// TODO Auto-generated method stub
{
		ArrayList <String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Purple");
		colors.add("Black");

		Iterator <String> iterator = colors.iterator();
		while(iterator.hasNext())
		{
		System.out.println(iterator.next());
		}
}	
}


