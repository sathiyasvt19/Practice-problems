public class Heapsort {
	public static void main(String args[]){
		int a[]={7,6,5,4,3,2,1,0,54,65};
		int n=a.length;
		sort(a,n);
	}
   static void sort(int a[],int n){
   	for(int i=n/2-1;i>=0;i--){
      heapyfy(a,n,i);
   	}
   	for(int j=n-1;j>=0;j--){
   		int temp=a[0];
   		a[0]=a[j];
   		a[j]=temp;
   		heapyfy(a,j,0);
   	}
   	for(int i=0;i<n;i++)
   	System.out.println(a[i]);
   }
   static void heapyfy(int a[],int n,int i){
   	int largest=i;
   	int l=i*2+1;
   	int r=i*2+2;
   	if(l<n && a[l]>a[largest])
   		largest=l;
   	if(r<n && a[r]>a[largest])
   		largest=r;
   	if(largest!=i){
   		int temp=a[largest];
   		a[largest]=a[i];
   		a[i]=temp;
   		   	heapyfy(a,n,largest);

   	}
   }
}