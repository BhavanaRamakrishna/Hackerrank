import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		int minIndex = 0 , maxIndex=0;
		long minSum = 0, maxSum=0;
		for(int arr_i=0; arr_i < 5; arr_i++){
			arr[arr_i] = in.nextInt();
			if (arr[arr_i]!=0){
			if (arr[arr_i]<arr[minIndex])
				minIndex = arr_i;
			else if (arr[arr_i]>arr[maxIndex])
				maxIndex = arr_i;
			}
		}
		for (int i =0; i<5;i++ ){
			if(i!=minIndex)
				minSum = minSum +arr[i];
			if(i!=maxIndex)
				maxSum = maxSum + arr[i];
		}
	   System.out.println(maxSum+ " " + minSum) ;
	}
}
