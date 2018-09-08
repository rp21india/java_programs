package lab;
import java.util.*;
public class insert_element_array_index_89 {

	public static void main(String[] args) {

		LinkedList<String> linkedlist = new LinkedList<String>();
		 
	    // Add elements to LinkedList
	    linkedlist.add("Delhi");
	    linkedlist.add("Agra");
	    linkedlist.add("Mysore");
	    linkedlist.add("Chennai");
	    linkedlist.add("Pune");
	 
	    // Adding new Element at 5th Position 
	    linkedlist.add(4, "NEW ELEMENT");

	    // Iterating the list in forward direction
	    System.out.println("LinkedList elements After Addition:");
	    Iterator it= linkedlist.iterator();
	    while(it.hasNext()){
	       System.out.println(it.next());
	    }
	 }
	}
		 