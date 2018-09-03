class ArrRotation {
	public static void main(String args[]) {
		int a[]={1,2,3,4,5,7,8,9,0};
		int d=5;
		
		leftRotatetemp(a,d);
	}
	void leftRotatetemp(int[] a,int d) {
		int j=0;
		int temp[]=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=a[i];
		}
		for(int i=0;i<a.length;i++) {
			if(i<a.length-d)
			a[i]=a[i+d];
			else {
				a[i]=temp[j++];
			}
		}
		for (int k=0;k<a.length;k++ ) {
			System.out.println("Left Rotation with temp array");
			System.out.print(a[k]+" ");
			
		}
		System.out.println();
	}

}