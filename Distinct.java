import java.util.*;
public class Distinct {
	public static void main(String[] args) {
	int mat[][] = {  { 1, 14, 3, 16},
                         { 2, 1, 3, 35},
                         { 1, 14, 3, 11},
                         { 25, 3, 2, 1},
                         {1, 3, 21, 14}
                                            };
          
            int n = 4;
            findAndPrintCommonElements(mat, n);
	}
	public static void findAndPrintCommonElements(int mat[][],
                                                     int n) {
		sortRow(mat,n);
		// for(int i=0;i<n;i++){
		// 	for(int j=0;j<n;j++)
		// 		System.out.print(mat[i][j]+",");
		// 	System.out.println();
		// }
		int ci[]=new int[n];
		int f=0;
		// for(int i=0;i<n;i++)
			// System.out.println(ci[i]);
		for(;ci[0]<n;ci[0]++) {
			int value=mat[0][ci[0]];
			boolean present=true;
			for(int i=1;i<n;i++){
				while(ci[i]<n && mat[i][ci[i]]<=value)
					ci[i]++;
				if(mat[i][ci[i]-1]!=value)
					present=false;
				if(ci[i]==n){
					f=1;
					break;
				}
			}
			if(present)
				System.out.println(value);
			if(f==1)
				break;

		}
	}
	public static void sortRow(int mat[][],int n){
		for(int i=0;i<n;i++)
			Arrays.sort(mat[i]);
	}
}