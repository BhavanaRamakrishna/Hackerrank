import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int migratoryBirds(int n, int[] ar) {
		// Complete this function
		int[] count = new int[5];
		int max =-999, ic=9;
		for(int i=0;i<n;i++){
			count[ar[i]-1]++;
		}
		for(int i=0;i<5;i++)
			if(count[i]>max){
				max= count[i];
				ic = i;
			}
		return ic+1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int result = migratoryBirds(n, ar);
		System.out.println(result);
	}
}
