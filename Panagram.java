/*
*Panagram :Given string should contain all charecter of alphepet(English);
*Example:
*	String "The quick brown fox jumps over the lazy dog" is Panagarm.
*   String "The quick brown fox jumps over the dog" is not Panagram.
*/

class Panagram{
	public static void main(String args[]) {
		Panagram p = new Panagram();
		String s="The quick brown fox jumps over the lazy dog";
		if(p.checkPanagram(s)) {
			System.out.println("Given String is Panagram");
		}
		else {
			System.out.println("Given String in not Panagram");
		}

	}
	public boolean checkPanagram(String s) {
		boolean status[] = new boolean[26];
		int index=0;
		for(int i=0;i<s.length();i++) {
			if('A' <= s.charAt(i) && 'Z' >= s.charAt(i)) {
                index = s.charAt(i)-'A';
			}
			if('a' <= s.charAt(i) && 'z' >= s.charAt(i)) {
				index=s.charAt(i)-'a';
			}
			status[index]=true;
		}
		for(int i=0;i<26;i++){
			if(status[i]==false)
				return false;
		}
		return true;
	}
}