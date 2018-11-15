import java.util.*;
public class MaxSum {
	public static void main(String args[]){
	MaxSum ms=new MaxSum();
	Scanner scan =new Scanner(System.in);
	int n=scan.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=scan.nextInt();
	}
	//int res=
	ms.kadneInd();
	//System.out.println(res);
	}
	public int kadne(int arr[],int n){
		int max_sum=arr[0];
		int result=arr[0];
		for(int i=1;i<n;i++){
			max_sum=Math.max(arr[i],max_sum+arr[i]);
			result=Math.max(result,max_sum);
		}
		return result;
	} 
	public void kadneInd(){
		// int max=Intiger.MIN_Value;
		// int max_end=0,s=0,end=0,start=0;
		// for(int i=0;i<n;i++){
		// 	if(max_end>max){
		// 		max=max_end;
		// 		start=s;
		// 		end=i;
		// 	}
		// 	if(max_end<0){
		// 		max_end=0;
		// 		s=i+1;
		// 	}
		// }
		// System.out.println("max sum from:"+start+"to:"+end+"="+max);


		String str = "aaaaaaaa";
char[] split = str.toCharArray();
char[] tmp = split;

Set<Character> visited = new HashSet<>();

for (int i =0; i< tmp.length; i++)
{
if (visited.contains(tmp[i]))
{
char incChar = (char) ((int) tmp[i] + 1);
while (visited.contains(incChar))
{
incChar = (char) ((int) incChar + 1);
}
split[i] = incChar;
}

visited.add(tmp[i]);
}
System.out.println(split);
String str = "aaaaaaaa";
char[] split = str.toCharArray();
char[] tmp = split;

Set<Character> visited = new HashSet<>();

for (int i =0; i< tmp.length; i++)
{
if (visited.contains(tmp[i]))
{
char incChar = (char) ((int) tmp[i] + 1);
while (visited.contains(incChar))
{
incChar = (char) ((int) incChar + 1);
}
split[i] = incChar;
visited.add(incChar);
}

visited.add(tmp[i]);
}
System.out.println(split);
	}
}