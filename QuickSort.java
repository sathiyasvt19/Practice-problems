import java.util.*;
class QuickSort {
	public static void main(String args[]) {
		QuickSort q = new QuickSort();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of element:");
		int n=scan.nextInt();
		int a[] = new int[n];
		System.out.println("Please enter the Element:");
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		q.qSort(a,0,n-1);
		for(int k:a)
			System.out.print(k+",");
	}

	void qSort(int a[],int l,int n) {
		if(l<n) {
			int pi = partition(a,l,n);
			qSort(a,l,pi-1);
			qSort(a,pi+1,n);
		}
	}
	int partition(int a[],int l,int n) {
		int pivot=a[n];
		int i=l-1;
		for(int j=l;j<n;j++) {
			if(a[j]<=pivot) {
				i++;
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		int tmp=a[n];
		a[n]=a[i+1];
		a[i+1]=tmp;

		return i+1;
	}

}