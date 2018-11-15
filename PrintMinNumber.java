public class PrintMinNumber {
	public static void main(String args[]){
		printMinNumberForPattern("IDID");
    	printMinNumberForPattern("I");
    	printMinNumberForPattern("DD");
    	printMinNumberForPattern("II");
    	printMinNumberForPattern("DIDI");
    	printMinNumberForPattern("IIDDD");
    	printMinNumberForPattern("DDIDDIID");
	}
	public static void printMinNumberForPattern(String s){
		int n=s.length();
		for(int i=0;i<n;i++){
			switch(s.charAt(i)){
				case 'I':
				         System.out.println("jsdgfjgsd");
			}
		}
	}
}