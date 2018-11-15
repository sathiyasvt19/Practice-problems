public class Maxsum {
	public static void main(String args[]){
	int a[]={8,3,1,2};
	int n=a.length;
	int cur_sum=0,cur_val=0,next_val=0, res=0;
	for(int i=0;i<a.length;i++)
	   cur_sum+=a[i];
	for(int j=0;j<a.length;j++)
		cur_val+=j*a[j];
	    res=cur_val;
	for(int i=1;i<a.length;i++){
		System.out.println(cur_val+"/"+cur_sum+"/"+n);
        next_val=cur_val-(cur_sum-a[i-1])+a[i-1]*(n-1);
        cur_val=next_val;
        System.out.println(cur_val);
        res=Math.max(res,cur_val);
	}
	System.out.println(res);

	}
}