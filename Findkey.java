public class Findkey {
	public static void main(String args[]){
		int a[]={4,5,6,7,1,2,3};
		int n=a.length;
		int key=6;
		int res=findKey(a,0,n-1,key);
		System.out.println(res);
	}
	public static int findKey(int a[],int l,int h,int key){
		if(l>h)
			return -1;
		int mid=(l+h)/2;
		if(a[mid]==key)
			return mid;
		if(a[l]<a[mid]){
			if(key>=a[l] && key<=a[mid])
				return findKey(a,l,mid-1,key);
			return findKey(a,mid+1,h,key);
		}
		if(key>=a[mid+1] && key<=a[h])
			return findKey(a,mid+1,h,key);
		return findKey(a,l,mid-1,key);
	}
}