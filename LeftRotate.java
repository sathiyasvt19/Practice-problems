public class LeftRotate {
	public static void main(String args[]){
	int a[]={1,2,3,4,5,6,7};
	int d=3;
	int n=a.length,j;
	for(int i=0;i<d;i++){
		int temp=a[0];
		for(j=0;j<n-1;j++)
			a[j]=a[j+1];
		a[j]=temp;
	}
	for(int k=0;k<n;k++){
		System.out.println(a[k]);
	}
	}
}