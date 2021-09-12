import java.util.*;
public class Matrix_add_and_Mul {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	      System.out.println("Enter no of rows and col for A and B matrix");
	      int r = s.nextInt();
	      int c = s.nextInt();
	      
			int a[][] = new int[r][c];
		   	 System.out.println("Enter the values of "+r+" "+c);
		   	 for(int i = 0;i<r;i++)
		   	 {
		   		for(int j =0;j<c;j++)
		   		{
		   			a[i][j]= s.nextInt();
		   		}
		   	 }
		   	 int b[][] = new int[r][c];
		   	 System.out.println("Enter the values of "+r+" "+c);
		   	 for(int i = 0;i<r;i++)
		   	 {
		   		 for(int j=0;j<c;j++)
		   		 {
		   			 b[i][j] = s.nextInt();
		   		 }
		   	 }
		   	 s.close();
		   	 int sum[][] = new int[r][c];
		   	 for(int i =0;i<r;i++)
		   	 {
		   		 for(int j=0;j<c;j++)
		   		 {
		   			 sum[i][j] = a[i][j] + b[i][j];
		   		 }
		   	 }
		   	 System.out.println("addition of the matrix is ");
		   	 for(int i =0;i<r;i++)
		   	 {
		   		 for(int j =0;j<c;j++) {
		   			 System.out.printf("%3d",sum[i][j]);
		   		 }
		   		 System.out.println();
		   	 }
		   	 
		   	 
		   	 
		   	 
		   	 
		   	 int x[][] = new int[r][c];
		 	System.out.println("multiplication of two matrix : \n");
		 	 for(int i =0;i<r;i++)
		   	 {
		   		 for(int j =0;j<c;j++) {
			 		x[i][j]= 0;
			 		for(int k=0;k<r && k<c;k++)
			 		{
				 		x[i][j] = x[i][j] + a[i][k] * b[k][j];
				 	}
			 	}
			 }
		 	for(int i =0;i<r;i++)
		   	 {
		   		 for(int j =0;j<c;j++) {
				 	System.out.printf("%3d",x[i][j]);
				 }
				 System.out.println();
		 	}

	}

}
