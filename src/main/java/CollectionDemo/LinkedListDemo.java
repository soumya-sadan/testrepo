package CollectionDemo;
import java.util.LinkedList;
public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 LinkedList lnk = new LinkedList();
 lnk.add("Priya");
 lnk.add(22);
 lnk.add("Kriya");
 lnk.add("Mariya");
 lnk.add('d');
 lnk.add(2222.455f);
 System.out.println(lnk);
 
  lnk.remove("Priya");
 System.out.println(lnk);
 
 boolean b = lnk.contains("Kriya");
 System.out.println(b);
 
 lnk.addFirst("Fariya");
 System.out.println(lnk);
 
 //print
 System.out.println(lnk.get(2));
 
 //update
lnk.set(3,"Miraya");
System.out.println(lnk);
 
//add at location
 lnk.add(4, "Skariya");
 System.out.println(lnk);
 
 System.out.println(lnk.size());
 
}

	
}


