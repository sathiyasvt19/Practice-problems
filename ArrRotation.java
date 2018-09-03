class ArrRotation {
	public static void main(String args[]) {
		ArrRotation ar=new ArrRotation();
		int a[]={1,2,3,4,5,7,8,9,0};
		for (int k=0;k<a.length;k++ ) {
			System.out.print(a[k]+" ");
			
		}
		System.out.println();
		int d=5;
		System.out.println("Left Rotation with temp array");
		ar.leftRotatetemp(a,d);
		System.out.println("Left Rotation one-by-one");
		ar.leftRotationbf(a,d);
	}
	void leftRotatetemp(int[] a,int d) {
		int j=0;
		int len=a.length;
		int temp[]=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=a[i];
		}
		for(int i=0;i<len;i++) {
			if(i<a.length-d)
			a[i]=a[i+d];
			else {
				a[i]=temp[j++];
			}
		}
		for (int k=0;k<len;k++ ) {
			System.out.print(a[k]+" ");
			
		}
		System.out.println();
	}
	void leftRotationbf(int[] a,int d) {
		int len=a.length,j;
		for(int i=0;i<d;i++){
			System.out.println("hello");
			for (int k=0;k<len;k++ ) {
			System.out.print(a[k]+" ");
			
		}
		System.out.println();
			int temp=a[0];
			for(j=0;j<len-1;j++) {
					a[j]=a[j+1];
			}
			a[j]=temp;

		}
		for (int k=0;k<len;k++ ) {
			System.out.print(a[k]+" ");
			
		}
		System.out.println();
	}

}