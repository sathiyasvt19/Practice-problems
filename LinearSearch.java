// search element in array
class LinearSearch {
	public static void main(String args[]) {
        LinearSearch ls= new LinearSearch();
		int arr[] = new int[]{34,4,65,76,65,57,44,77,31,7,8};
		int n=578;
		System.out.println("Binary Search iterative method");
		int resultb=ls.binarySearch(arr,n);
		if(resultb==-1)
			System.out.println("Not found");
		else
			System.out.println("Found at:"+resultb);
		System.out.println("Linear Search");
		int result=ls.search(arr,n);
		if(result==-1)
			System.out.println("Not found");
		else
			System.out.println("Found at:"+result);
		
	}
	//Linear search n
	public int search(int arr[],int n) {
		for(int i=0;i<arr.length;i++){

			if(arr[i]==n)
				return i;
		}
		return -1;

	}
	//Binary search -Log n
	public int binarySearch(int arr[],int n) {
		int l=0,r=arr.length-1;
		while(l<=r) {
			int m=(l+r)/2;
			if(arr[m]==n)
				return m;
			if(n<arr[m])
				r=m-1;
			if(n>arr[m])
				l=m+1;
		}
		return -1;
	}
	
}