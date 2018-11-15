import java.util.*;
public class FindMissingNumber{
	public static void main(String args[]){
		FindMissingNumber fm= new FindMissingNumber();
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int num[]=new int[n-1];
		for(int i=0;i<n-1;i++){
           num[i]=scan.nextInt();
		} 
		int result=fm.fmNumber(num,n);
		System.out.println(result);
	}
	public int fmNumber(int num[],int n){
		int sum=n*(n+1)/2;
		int sum_num=num[0];
		for(int i=1;i<n-1;i++){
			sum_num =sum_num + num[i];
		}
		return sum-sum_num;
	}
}