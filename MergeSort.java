import java.util.*;
class MergeSort {
	public static void main(String args[]) {
		MergeSort s = new MergeSort();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the Number of element to sort Value:");
		int n=scan.nextInt();
		int a[] = new int[n];
		System.out.println("Please enter the array element:");
		for(int i=0;i<a.length;i++)
			a[i]=scan.nextInt();
		s.mSort(a,0,n-1);
		System.out.println("result");
		for(int k:a)
			System.out.print(k+",");
	}
	void mSort(int a[],int l,int n) {
		if(l<n) {
			int m=(l+n)/2;
			mSort(a,l,m);
			mSort(a,m+1,n);
			merge(a,l,m,n);
		}
	}
	void merge(int[] a,int l,int m,int n) {
		int n1=m-l+1;
		int n2=n-m;
		int a1[]=new int[n1];
		int a2[]=new int[n2];
		for(int i=0;i<n1;i++)
			a1[i]=a[l+i];
		for(int j=m;j<n2;j++)
			a2[j]=a[m+1+j];
		int i=0,j=0,k=l;
		while(i<n1 && j<n2){
			if(a1[i]<=a2[j]){
				a[k]=a1[i];
				i++;
			}
			else{
				a[k]=a2[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			a[k]=a1[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=a2[j];
			j++;
			k++;
		}
	}




	// Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void mergee(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
}