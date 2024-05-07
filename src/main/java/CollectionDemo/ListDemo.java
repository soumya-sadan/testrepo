package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List <String> lst = new ArrayList<String>();
     lst.add("Listyttyt");
     lst.add("List11");
     lst.add("Listyy");
     lst.add("Lisyyt");
     lst.add("List11");
     lst.add("List");
     lst.add("ghi");
     lst.add("def");
     lst.set(0, "List");
     int indx = lst.indexOf("List11");
    // System.out.println(lst);
     System.out.println(indx);
     int indx1=lst.lastIndexOf("List");
     System.out.println(indx1);
    // lst.remove(3);
  System.out.println(lst);
  
  System.out.println(lst.get(2));
  boolean b = lst.contains("ghi");
  System.out.println(b);
	
	
	}

}
