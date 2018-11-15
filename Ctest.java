import java.util.*;
public class Ctest {
	public static void main(String args[]) {
		//ArrayList l=new ArrayList();
		ArrayList<Integer> l = new ArrayList();
		for(int i=0;i<10;i++)
			l.add(i);
		    l.remove(0);
		l.forEach(e->System.out.print(e+"'"));
		 //Iterator it=new l.iterator();
		//  Iterator it = l.iterator();
		//  while(it.hasNext()){
		//  	int i=(Integer)it.next();
		//  	System.out.print(i+"'");
		//  	if(i%2!=0)
		//  		it.remove();
		//  }
		// System.out.println();
		// System.out.print(l);
	}
}