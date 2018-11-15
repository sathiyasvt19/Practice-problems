import java.util.*;
public class RotationCount {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
	//int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int result=rcount(a,n);
		System.out.println(result);
	}
	public static int rcount(int a[],int n){
		int min=a[0];
		int res=0;
		for(int i=0;i<n;i++){
			if(a[i]<min){
				min=a[i];
				res=i;
			}
		}
		return res;
	}
}