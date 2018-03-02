import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int getTotalX(int[] a, int[] b){
		// Complete this function
		int max =-999,min=999;
		int flag=0, flag2=0,count=0;
		for(int i=0;i<a.length;i++)
			if(a[i]>max)
				max= a[i];
		for(int i=0;i<b.length;i++)
			if(b[i]<min)
				min=b[i];
		for(int i=max;i<=min;i++){
			flag=0;
			for(int j=0;j<a.length;j++)
				if(i%a[j]!=0){
					flag =1;
					break;
				}
			if(flag==0){
				flag2=0;
				for(int j=0;j<b.length;j++)
					if(b[j]%i !=0){
						flag2=1;
						break;
					}
				if(flag2==0)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for(int b_i=0; b_i < m; b_i++){
			b[b_i] = in.nextInt();
		}
		int total = getTotalX(a, b);
		System.out.println(total);
	}
}
