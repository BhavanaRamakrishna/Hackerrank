import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int positive=0, negative=0, zero=0;
		double positivef, negativef, zerof;
		int arr[] = new int[n];
		for(int arr_i=0; arr_i < n; arr_i++){
			arr[arr_i] = in.nextInt();
			if (arr[arr_i]>0)
				positive = positive + 1;
			else if(arr[arr_i]==0)
				zero = zero + 1;
			else
				negative = negative + 1;

		}
		positivef = (double)positive / n;
		negativef = (double)negative / n;
		zerof = (double)zero / n;
		System.out.println(positivef + "\n" + negativef + "\n" + zerof);
	}
}
