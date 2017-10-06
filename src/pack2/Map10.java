package pack2;

import java.util.HashMap;

public class Map10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm=new HashMap();
		hm.put(1,"thiruathi");
		hm.put(2,"ahirupathi");
		hm.put(4,"thiruathi");
		System.out.println(hm);
		hm.get(1);
		System.out.println(hm.get(2));
		Object obj=hm.clone();
		System.out.println(obj);
		System.out.println(hm.hashCode());
		System.out.println(obj.hashCode());
	}

}
