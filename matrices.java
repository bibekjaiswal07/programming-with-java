package matrices
import java.util.Scanner; 
class array{

	public static void main(String[] args) {
	int n= Integer.parseInt (args[0]);
	int[][]A=new int[n][n];
	int[][]B=new int[n][n];
	int[][]C=new int[n][n];
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the A elements");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++) {
			A[i][j]=sc.nextInt();
		}
	}
	System.out.println("enter the B elements");
	for(int i=0;i<n;i++) {
		for (int j=0;j<n;j++)
			{
			B[i][j]=sc.nextInt();
			}
	}
	for(int i=0;i<n;i++) {
		for(int j= 0;j<n;j++) {
			C[i][j]=A[i][j]+B[i][j];
			}
	}
System.out.println("After adding the array is");
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		
	System.out.println("c[i][j]");
}
System.out.println();
}
}
}

	
