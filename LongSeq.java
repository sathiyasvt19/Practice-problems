public class LongSeq {
	public static void main(String args[]) {
		int a[]={1, 1, 0};
		int n=a.length;
		int prev_zero=-1,prev_prev_zero=-1,max_count=0,max_index=-1;
		for(int i=0;i<n;i++){
           if(a[i]==0){
           	if(i-prev_prev_zero > max_count) {
           		max_count=i-prev_prev_zero;
           		//System.out.println(max_count);
           		max_index=prev_zero;
           	}
           	prev_prev_zero=prev_zero;
           	prev_zero=i;
           }
		}
		if (n-prev_prev_zero > max_count)
       max_index = prev_zero;
		System.out.println(max_index);
	}
}