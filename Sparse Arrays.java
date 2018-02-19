import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;
public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int numOfStrings = in.nextInt();
		String[] array = new String[numOfStrings];
		int n=0;
		Map<String, Integer> hash = new HashMap<String, Integer>();
		for(int i=0; i<numOfStrings; i++){
			array[i] = in.nextLine();
			System.out.print(array[i]);
			if(hash.containsKey(array[i]))
				hash.put(array[i],hash.get(array[i])+1);
			else
				hash.put(array[i],1);
			n=i;
		}
		int numOfQueries = in.nextInt();
		int[] output = new int[numOfQueries];
		for(int i=0;i<numOfQueries; i++){
			String s = in.nextLine();
			if(hash.containsKey(s))
				output[i] = hash.get(s);
			else
				output[i]= 0;
		}
		for(int i =0;i<output.length;i++){
			System.out.println(output[i]);
		}
	}
}
