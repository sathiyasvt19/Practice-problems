/* This is a simple Java program.
   FileName : "HelloWorld.java". */
   import java.util.*;
class CharIncrement
{
    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(String args[])
    {
        test();
    }
    public static void test(){
    	Scanner scan = new Scanner(System.in);
    	String a=scan.nextLine();
    	char v[]= new char[256];
    	Arrays.fill(v, '0');
    	char temp[] = a.toCharArray();
    	for(int i=0;i<temp.length;i++){
    		if(v[temp[i]]==1){
    			temp[i]++;
    			while(v[temp[i]]==1){
    				temp[i]++;
    			}
    			v[temp[i]]=1;
    		}
    		else{
    			v[temp[i]]=1;
    		}
    	}
    	System.out.println(temp);
    }
}













