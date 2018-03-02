import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;
public class Solution {

	static String solve(int year){
		// Complete this function
		StringBuilder date= new StringBuilder();
		if(year >= 1700 && year<=1917){ // Julian's calendar
			if(year%4 ==0){    // leap year
				// till august 244 days so sept 12 will be 256th day
			   date.append("12.09.");
				date.append(year);
		}
			else{
				date.append("13.09.");
				date.append((year));
			}
	}
		if(year==1918){
			if(year%400 ==0 || (year%4 ==0 && year%100!=0)){
				date.append("25.09.");
				date.append((year));
			}
			else{
				date.append("26.09.");
				date.append((year));
			}
		}
		if(year>=1919 && year <=2700){
			if(year%400 ==0 || (year%4 ==0 && year%100!=0)){
				date.append("12.09.");
				date.append((year));
			}
			else{
				date.append("13.09.");
				date.append((year));
			}
		}
		return date.toString();
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		String result = solve(year);
		System.out.println(result);
	}
}
