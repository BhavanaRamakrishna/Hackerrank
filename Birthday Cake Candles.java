import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int max=0, maxCount =0;
		int height[] = new int[n];
		for(int height_i=0; height_i < n; height_i++){
			height[height_i] = in.nextInt();
			if(height_i!=0){
				if(height[height_i]>height[max])
					max=height_i;
			}

		}
		for (int i=0;i<n;i++)
			if (height[i]==height[max])
				maxCount = maxCount +1;
		System.out.println(maxCount);
	}
}
