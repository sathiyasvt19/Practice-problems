
import java.util.*;
public class Coll {
	public static void main(String args[]){


		byte[] b_arr = {71, 101, 101, 107, 115};
Charset cs = Charset.defaultCharset();
String s_byte_char = new String(b_arr, cs); //Geeks
System.out.println(s_byte);
	HashMap<Integer,String> hm=new HashMap<>();
	hm.put(2,"hello");
	hm.put(1,"test1");
	hm.put(-1,"sathiya");
	for(Map.Entry<Integer,String>m:hm.entrySet())
		if(m.getValue()=="sathiya"){
			m.setValue("sathiyaraj");
		}
		
		for(Map.Entry<Integer,String>mp:hm.entrySet()){
			System.out.println(mp);
		}
		System.out.println("for Each");
    hm.forEach((k,v)->{
    	hm.put(k,v+"  java");});
    	//System.out.println(v));
    	hm.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));


	}
	
}


// for(Map.Entry<Integer,Integer> c:hm.entrySet()){
// 		c.setValue(c.getValue()*100);
// 	}

     // for(Map.Entry<Integer,Integer> mp:hm.entrySet())
     // 	System.out.println(mp.getValue());
	//h