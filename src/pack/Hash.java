package pack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*HashSet hs= new HashSet();
		   hs.add("thiru");
		   hs.add("hi");
		   hs.add("thiru");
		   hs.add("thiru");
		   System.out.println(hs);
		   hs.hashCode();*/
		/*LinkedHashSet hs=new LinkedHashSet();
		hs.add("thiru");
		
		   hs.add("hi");
		   hs.add("thiru");
		   hs.add("thiru");
		   System.out.println(hs);
		   Iterator it=hs.iterator();
		   while(it.hasNext()){
			   System.out.println(it.next());
		   }
		*/
		TreeSet hs= new TreeSet();
		
		    hs.add("thiru");
		
		   hs.add("hi");
		   hs.add("thiru");
		   hs.add("thiru");
		   System.out.println(hs);
		   Iterator it=hs.iterator();
		   while(it.hasNext()){
			   System.out.println(it.next());
		   }
		

	}

}
