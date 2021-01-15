package zero;

public class zero {

	public static void main(String[] args) {
		int[][] A =  {{3,5,3,-51,5},{5,7,15,5,5},{7,8,9,2,4}};
		
		int i , j,n,m, imax=0, imin=0,jmax=0, jmin=0;
		n=5;
		m=3;
		
		for (i=0; i<m; i++)
			for (j=0;j<n;j++) {
		
				if(A[i][j]>A[imax][jmax] ) {
					imax=i;
					jmax=j;}
				else if(A[i][j]<A[imin][jmin] ) {
					imin=i;
					jmin=j;}
			}
		System.out.println(A[imax][jmax]+ "   "+ A[imin][jmin]);
		
		/*int[][] A =  {{3,5,3,1,5},{5,7,5,5,5},{7,8,9,2,4},{5,5,2,6,6},{5,5,5,5,5}};
		
		int i , j,n,m;
		n=5;
		
		
		for (i=0; i<n; i++)
			for (j=0;j<n;j++) {
		
				if(i==j || (i+j+1)==n )
					A[i][j]=0;
				
			}
		
		
		for (i=0; i<n; i++) {
			for (j=0;j<n;j++)
				System.out.print(A[i][j] + "   ");
		System.out.println();
		}

		*/
		
	}

}