import java.util.Arrays;

public class Array2D {
	public static void main(String[] args) {
		int a=1;
		int[][] arr = new int[2][3];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j]=a;
				a++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
}
