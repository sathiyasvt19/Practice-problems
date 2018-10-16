import java.util.*;
class MatrixRotation {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int m,n;
		System.out.println("Please Enter the value of m and m:");
		m=scan.nextInt();
		n=scan.nextInt();
		int mat[][]=new int[m][n];
		System.out.println("Please enter the matrix element:");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				mat[i][j]=scan.nextInt();
		}
		rotate(m,n,mat);
	}
	static void rotate(int m,int n,int mat[][]){
		int prev,cur,row=0,col=0;
		while(row < m && col < n){
			if(row+1==m || col+1==n)
				break;
			 prev=mat[row+1][col];
			for(int i=col;i<n;i++){
				 cur = mat[row][i];
				mat[row][i]=prev;
				prev=cur;
			}
			row++;
			for(int i=row;i<m; i++){
				 cur = mat[i][n-1];
				mat[i][n-1]=prev;
				prev=cur;
			}
			n--;
			//if(row<m){
				for(int i=n-1;i>=col;i--){
					 cur=mat[m-1][i];
					mat[m-1][i]=prev;
					prev=cur;
				}
				m--;
			//}
			//if(col<n){
				for(int i=m-1;i>=row;i--){
					 cur =mat[i][col];
					mat[i][col]=prev;
					prev=cur;
				}
				col++;
			//}
			
		}
		for(int k[]:mat){
				for(int t:k)
					System.out.print(t+",");
				System.out.println();
			}
	}
}