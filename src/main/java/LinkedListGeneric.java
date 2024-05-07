import java.util.LinkedList;

public class LinkedListGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> lnk = new LinkedList <Integer>();
		 lnk.add(33);
		 lnk.add(22);
		 lnk.add(44);
		 //lnk.add("Mariya");
		// lnk.add('d');
		 lnk.add(222);
		 System.out.println(lnk);
		 
		  lnk.remove(0);
		 System.out.println(lnk);
		 
		 boolean b = lnk.contains(23);
		 System.out.println(b);
		 
		 lnk.addFirst(65);
		 System.out.println(lnk);
		 
		 //print
		 System.out.println(lnk.get(2));
		 
		 //update
		lnk.set(3,77);
		System.out.println(lnk);
		 
		//add at location
		 lnk.add(4, 555);
		 System.out.println(lnk);
		 
		 System.out.println(lnk.size());
		 
		}

			
		}


	


