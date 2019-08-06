import java.util.Scanner;

public class Testt22 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int count = 1;
		for(int i=0;i<arr.length;++i) {
			for(int j = 0;j<arr[i].length;++j) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}		
	}
}
