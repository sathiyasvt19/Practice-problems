// search element in array
class LinearSearch {
	public static void main(String args[]) {
        LinearSearch ls= new LinearSearch();
		int arr[] = new int[]{34,4,65,76,65,57,44,77,31,7,8};
		int n=57;
		int result=ls.search(arr,n);
		if(result==-1)
			System.out.println("Not found");
		else
			System.out.println("Found at:"+result);
		
	}
	public int search(int arr[],int n) {
		for(int i=0;i<arr.length;i++){

			if(arr[i]==n)
				return i;
		}
		return -1;

	}
	
}