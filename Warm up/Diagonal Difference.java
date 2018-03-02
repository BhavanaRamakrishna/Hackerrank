import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		int primarySum = 0, secondarySum = 0, secondaryDiagonalIndex = n-1;
		int result;
		for(int a_i=0; a_i < n; a_i++){
			for(int a_j=0; a_j < n; a_j++){
				a[a_i][a_j] = in.nextInt();
				if (a_i == a_j)
					primarySum = primarySum + a[a_i][a_j];
			}
			secondarySum = secondarySum + a[a_i][secondaryDiagonalIndex];
			secondaryDiagonalIndex = secondaryDiagonalIndex - 1;
		}
		if (primarySum >= secondarySum)
			result = primarySum - secondarySum;
		else
			result = secondarySum - primarySum;
		System.out.println(result);

	}
}
